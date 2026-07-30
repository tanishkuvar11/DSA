class Solution {
    public int minimumPushes(String word) 
    {
        int ans=8;
        if(word.length()>8)
        {
            for(int i=8; i<word.length(); i++)
            {
                int j=i/8+1;
                ans+=j;
            }

            return ans;
        }

        else
            return word.length();
    }
}