class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int leftProd=1;
        int rightProd=1;
        int[] ans=new int[nums.length];
        Arrays.fill(ans, 1);

        for(int i=1; i<nums.length; i++)
        {
            leftProd*=nums[i-1];
            ans[i]*=leftProd;
        }

        for(int i=nums.length-2; i>=0; i--)
        {
            rightProd*=nums[i+1];
            ans[i]*=rightProd;
        }

        return ans;        
    }
}