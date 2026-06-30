class Solution {
    public int trailingZeroes(int n) 
    {
        int c5=0;
        int temp1=n;

        while(temp1>0)
        {
            temp1/=5;
            c5+=temp1;
        }

        return c5;
    }
}