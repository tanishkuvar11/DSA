class Solution {
    public int hIndex(int[] citations) 
    {
        Arrays.sort(citations);
        int ct0=0;

        for(int i=0; i<citations.length; i++)
        {
            if(citations.length-i<=citations[i])
                return citations.length-i;
        }

        return 0;
    }
}