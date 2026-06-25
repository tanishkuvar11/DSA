class Solution {
    public int numberOfSpecialChars(String word) 
    {
        int[] idx = new int[126];
        Arrays.fill(idx, -1);

        char[] arr=word.toCharArray();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
                idx[arr[i]]=i;

            if(arr[i]>='A' && arr[i]<='Z' && idx[arr[i]]==-1)
                idx[arr[i]]=i;
        }    

        int finalctr=0;
        for(int i=65; i<126; i++)
        {
            if(idx[i] < idx[i-32] && idx[i]!=-1)
                finalctr++;
        }

        return finalctr;
    }
}