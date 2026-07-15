class Solution {
    public int GCD(int x, int y)
    {
        if(y==0)
            return x;
        return GCD(y, x%y);
    }
    public int gcdOfOddEvenSums(int n) 
    {
        int sumOdd=0;
        int sumEven=0;

        for(int i=2; i<=n*2; i+=2)
            sumEven+=i;

        for(int i=1; i<=n*2-1; i+=2)
            sumOdd+=i;

        return GCD(sumOdd, sumEven);
    }
}