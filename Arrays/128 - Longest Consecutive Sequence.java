class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Arrays.sort(nums);

        int currLen=0;
        int maxLen=0;
        int lastSmallest=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]-1 == lastSmallest)
            {
                currLen++;
                lastSmallest=nums[i];
            }

            else if(nums[i]!=lastSmallest)
            {
                currLen=1;
                lastSmallest=nums[i];
            }

            maxLen=Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}