class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int[] ans=new int[nums.length];

        int left=0;
        int right=nums.length-1;
        int k=0;
        int m=nums.length-1;

        int ctrlt=0;
        int ctrgt=0;
        int ctreq=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>pivot)
                ctrgt++;
            
            else if(nums[i]<pivot)
                ctrlt++;

            else
                ctreq++;
        }

        ans[ctrlt]=pivot;
        
        for(int i=1; i<ctreq; i++)
            ans[ctrlt+i]=pivot;

        while(left<=nums.length-1 || right>=0)
        {
            if(nums[left]<pivot)
                ans[k++]=nums[left];

            if(nums[right]>pivot)
                ans[m--]=nums[right];

            left++;
            right--;
        }    

        return ans;
    }
}