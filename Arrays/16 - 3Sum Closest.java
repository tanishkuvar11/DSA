class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minDiff=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<nums.length-2;i++) {
            int left=i+1;
            int right=nums.length-1;

            while(left<right) {
                int currSum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(currSum-target);

                if(diff<minDiff) {
                    minDiff=diff;
                    ans=currSum;
                }

                if(currSum<target)
                    left++;
                else if(currSum>target)
                    right--;
                else
                    return currSum;
            }
        }

        return ans;
    }
}