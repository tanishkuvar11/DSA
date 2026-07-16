class Solution {
    public long gcd(int x, int y)
    {
        if(y==0)
            return (long)x;

        return gcd(y, x%y);
    }

    public long gcdSum(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        long[] prefixGcd=new long[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>max)
                max=nums[i];

            prefixGcd[i]=gcd(nums[i], max);
        }

        Arrays.sort(prefixGcd);

        int a=0, b=prefixGcd.length-1;
        long ans=0;

        while(a<b)
        {
            ans+=gcd((int)prefixGcd[a], (int)prefixGcd[b]);
            a++;
            b--;
        }

        return ans;
    }
}