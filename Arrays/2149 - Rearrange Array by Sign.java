class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int[] arr=new int[nums.length];
        int p=0, q=1;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                arr[p]=nums[i];
                if(p<nums.length-3)
                    p+=2;
            }

            else
            {
                arr[q]=nums[i];
                if(q<nums.length-2)
                    q+=2;
            }
        }    

        return arr;
    }
}