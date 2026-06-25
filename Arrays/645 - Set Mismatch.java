class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        Arrays.sort(nums);
        int[] ans=new int[2];

        int dup=-1;
        int miss=-1;

        for(int i=1; i<nums.length; i++)
        {    
            if(nums[i]==nums[i-1])
                dup=nums[i];

            else if(nums[i]>nums[i-1]+1)
                miss=nums[i-1]+1;
        }

        if(miss==-1)
        {
            if(nums[0]!=1)
                miss=1;
            else
                miss=nums.length;
        }

        ans[0]=dup;
        ans[1]=miss;

        return ans;
    }
}