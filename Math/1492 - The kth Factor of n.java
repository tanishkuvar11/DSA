class Solution {
    public int kthFactor(int n, int k) 
    {
        int ctr=0;

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                ctr++;
            
            if(ctr==k)
                return i;
        }   

        return -1; 
    }
}