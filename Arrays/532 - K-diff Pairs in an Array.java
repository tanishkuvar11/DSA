class Solution {
    public int findPairs(int[] nums, int k) 
    {
        int ctr=0;

        if(k==0)
        {
            Arrays.sort(nums);
            for(int i=1; i<nums.length; i++)
            {
                if(nums[i]==nums[i-1])
                {
                    ctr++;
                    while(i<nums.length && nums[i]==nums[i-1])
                        i++;
                    
                    i--;
                }
            }

            return ctr;
        }

        HashSet<Integer> set=new HashSet<>();
        
        for(int i:nums)
            set.add(i);

        for(int i:set) 
        { 
            if(set.contains(i+k))
                ctr++; 
        }

        return ctr;
    }
}