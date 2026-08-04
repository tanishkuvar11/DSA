class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer> l=new ArrayList<>();

        Arrays.sort(nums);

        int min=nums[0], max=nums[nums.length-1];

        if(nums.length==max-min+1)
            return l;

        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);

        for(int i=min; i<max; i++)
        {
            if(!set.contains(i))
                l.add(i);
        }

        return l;
            
    }
}