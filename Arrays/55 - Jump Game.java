class Solution {
    public boolean canJump(int[] nums) 
    {
        int i=nums.length-1;

        while(true)
        {
            for(int k=i-1; k>=0; k--)
            {
                if(nums[k]>=(i-k))
                    i=k;

                if(i!=0 && k==0)
                    return false;
            }

            if(i==0)
                return true;
        }     
    }
}