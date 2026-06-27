class Solution {
    public int mySqrt(int x) 
    {
        long ans=0;
        while(true)
        {
            if(ans*ans<x)
                ans++;

            else if(ans*ans==x)
                break;

            else
            {
                ans--;
                break;
            }
        }

        return (int)ans;
    }
}