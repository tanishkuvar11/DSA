class Solution {
    public void rotate(int[] nums, int k) 
    {
        k=k%nums.length;

        int[] temp=new int[k];
        int p=0;
        for(int i=nums.length-k; i<nums.length; i++)
            temp[p++]=nums[i];

        for(int i=nums.length-k-1; i>=0; i--)
            nums[i+k]=nums[i];

        for(int i=0; i<k; i++)
            nums[i]=temp[i];
    }
}
