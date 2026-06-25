class Solution {
    public int numberOfSpecialChars(String word) 
    {
        int ctr=0;
        int[] flagUp=new int[26];
        int[] flagLow=new int[26];

        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)>='a' && word.charAt(i)<='z' && flagLow[(int)word.charAt(i)-97]==0)
                flagLow[(int)word.charAt(i)-97]=1;

            else if(word.charAt(i)>='A' && word.charAt(i)<='Z' && flagUp[(int)word.charAt(i)-65]==0)
                flagUp[(int)word.charAt(i)-65]=1;
        }

        for(int i=0; i<26; i++)
        {
            if(flagLow[i]==1 && flagUp[i]==1)
                ctr++;
        }

        return ctr;
    }
}