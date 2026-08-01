class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
            int first=0, last=nums.length-1;
            int[] ans={-1,-1};
            while(first<=last)
            {
                int mid=(first+last)/2;

                if(nums[mid]<target)
                {
                    first=mid+1;
                    continue;
                }

                else if(nums[mid]>target)
                {
                    last=mid-1;
                    continue;
                }

                else
                {
                    ans[0]=mid;
                    last=mid-1;
                }
            }

            first=0;
            last=nums.length-1;
            while(first<=last)
            {
                int mid=(first+last)/2;

                if(nums[mid]<target)
                {
                    first=mid+1;
                    continue;
                }

                else if(nums[mid]>target)
                {
                    last=mid-1;
                    continue;
                }

                else
                {
                    ans[1]=mid;
                    first=mid+1;
                }
            }

            return ans;
    }
}