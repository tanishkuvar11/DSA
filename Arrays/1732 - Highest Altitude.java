class Solution {
    public int largestAltitude(int[] gain) 
    {
        int maxAlt=0;
        int Alt=0;

        for(int i=0; i<gain.length; i++)
        {
            Alt+=gain[i];
            maxAlt=Math.max(maxAlt, Alt);  
        }

        return maxAlt;
    }
}