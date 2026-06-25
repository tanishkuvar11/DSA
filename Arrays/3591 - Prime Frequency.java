class Solution {
    public boolean checkPrimeFrequency(int[] nums) 
    {
        int[] map=new int[101];

        for(int i=0; i<nums.length; i++)
            map[nums[i]]++;

        for(int i=0; i<map.length; i++)
        {
            int flag=0; //assume prime
            for(int j=2; j<=Math.sqrt(map[i]); j++)
            {
                if(map[i]==2)
                    return true;

                else if(map[i]%j==0)
                    flag=1; //not prime
            }

            if(map[i]==0||map[i]==1)
                flag=1; //not prime if 0 or 1

            if(flag==0)
                return true;            
        }

        return false;  
    }
}