class Solution {
    public int countDigitOccurrences(int[] nums, int digit) 
    {
        int ctr=0;
        String[] n = new String[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            n[i]=String.valueOf(nums[i]);

            for(int j=0; j<n[i].length(); j++)
            {
                if(n[i].charAt(j)==(char) ('0' + digit))
                    ctr++;
            }
        }    

        return ctr;
    }
}