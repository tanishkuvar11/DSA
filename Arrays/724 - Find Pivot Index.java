class Solution {
    public int pivotIndex(int[] nums) 
    {
        int lSum=0;
        int total=0;

        for(int i:nums)
            total+=i;

        for(int i=0; i<nums.length; i++)
        {
            if(lSum==(total-nums[i]-lSum))
                return i;

            lSum+=nums[i];
        }

        return -1;
    }
}