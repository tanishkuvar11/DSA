class Solution {
    public String getHint(String secret, String guess) 
    {
        int A=0;
        int B=0;

        for(int i=0; i<secret.length(); i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                A++;
                secret=secret.substring(0,i)+"X"+secret.substring(i+1);
                guess=guess.substring(0,i)+"Y"+guess.substring(i+1);
            }
        }

        for(int i=0; i<secret.length(); i++)
        {
            int idx=secret.indexOf(guess.charAt(i));
            
            if(idx!=-1)
            {
                secret=secret.substring(0,idx)+"X"+secret.substring(idx+1);
                B++;
            }
        }

        String ans = String.valueOf(A)+"A"+String.valueOf(B)+"B";
        return ans;
    }
}