class Solution {
    public long sumAndMultiply(int n) 
    {
        long sum=0;
        long c=0;
        String x=String.valueOf(n);
        for(int i=0; i<x.length(); i++)
        {
            if(x.charAt(i)!='0')
            {
                sum+=Integer.parseInt(String.valueOf(x.charAt(i)));
                c+=Integer.parseInt(String.valueOf(x.charAt(i)));
                sum*=10;
            }
        }

        sum/=10;
        sum*=c;
        return sum;
    }
}