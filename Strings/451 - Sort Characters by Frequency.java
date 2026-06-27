class Solution {
    public static String frequencySort(String s) 
    {
        int[] freq=new int[123];
        for(int i=0; i<s.length(); i++)
            freq[(int)s.charAt(i)]++;

        String res="";
            
        for(int i=0; i<freq.length; i++)
        {
            int max=i;
            for(int j=0; j<freq.length; j++)
            {
                if(freq[j]>freq[max] && freq[j]>0)
                    max=j;
            }

            if(freq[max]>0)
            {
                for(int k=0; k<freq[max]; k++)
                    res+=(char)max;
                    
                freq[max]=-1;
            }
        }

        return res;
    }
}