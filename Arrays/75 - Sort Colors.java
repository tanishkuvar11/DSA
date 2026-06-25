class Solution {
    public void sortColors(int[] nums) 
    {
        int freq[]=new int[3];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                freq[0]++;
            
            else if(nums[i]==1)
                freq[1]++;

            else
                freq[2]++;
        }    

        int k=0, a=0,b=0,c=0;
        while(a<freq[0])
        {
            nums[k++]=0;
            a++;
        }

        while(b<freq[1])
        {
            nums[k++]=1;
            b++;
        }

        while(c<freq[2])
        {
            nums[k++]=2;
            c++;
        }
    }
}