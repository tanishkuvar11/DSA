class Solution {
    public int lengthOfLastWord(String s)
    {
        int len=0;
        if(s.length()==1 && s.charAt(0)!=' ')
            return 1;

        int i=s.length()-1;
        while(s.charAt(i)==' ')
            i--;

        while(i>=0 && s.charAt(i)!=' ')
        {
            len++;
            i--;
        }

        return len;
    }
}