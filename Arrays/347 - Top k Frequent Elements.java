class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);

            else
                map.put(nums[i], 1);
        }

        TreeMap<Integer, List<Integer>> tree=new TreeMap<>();
        for(int x:map.keySet())
        {
            if(tree.containsKey(map.get(x)))
            {
                List<Integer> l=tree.get(map.get(x));
                l.add(x);
                tree.put(map.get(x), l);
            }

            else
            {
                List<Integer> l1=new ArrayList<>();
                l1.add(x);
                tree.put(map.get(x), l1);
            }
        }

        int[] ans=new int[k];
        int c=0;
        for(int i=1; i<=k; i++)
        {
            Map.Entry<Integer, List<Integer>> m=tree.lastEntry();
            for(int x:m.getValue())
            {
                ans[c++]=x;
                if(c==k)
                    return ans;
            }
            tree.pollLastEntry();
        }

        return ans;
    }
}