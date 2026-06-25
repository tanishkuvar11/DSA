class Solution {
    public String mapWordWeights(String[] words, int[] weights) 
    {
        String ans="";
        for(int i=0; i<words.length; i++)
        {
            int wt=0;
            for(int j=0; j<words[i].length(); j++)
                wt+=weights[(int)words[i].charAt(j)-'a'];

            wt=wt%26;
            ans+=(char)(122-wt);
        }    

        return ans;
    }
}