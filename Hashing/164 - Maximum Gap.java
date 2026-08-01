class Solution {
    public int maximumGap(int[] nums) 
    {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int max=0;
        Integer prev=null;
        for(int x:map.keySet())
        {
            if(prev!=null)
                max=Math.max(max, x-prev);
            prev=x;
        }
        
        return max;
    }
}