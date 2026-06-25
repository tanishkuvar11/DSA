class Solution {
    public int totalWaviness(int num1, int num2) 
    {
        int ctr=0;
        for(int i=num1; i<=num2; i++)    
        {
            String s=String.valueOf(i);

            if(s.length()<3)
                continue;

            for(int j=1; j<s.length()-1; j++)
            {
                if(Integer.valueOf(s.charAt(j))>Integer.valueOf(s.charAt(j-1)) &&
                Integer.valueOf(s.charAt(j))>Integer.valueOf(s.charAt(j+1)))
                    ctr++;

                else if(Integer.valueOf(s.charAt(j))<Integer.valueOf(s.charAt(j-1)) &&
                Integer.valueOf(s.charAt(j))<Integer.valueOf(s.charAt(j+1)))
                    ctr++;
            }
        }

        return ctr;
    }
}