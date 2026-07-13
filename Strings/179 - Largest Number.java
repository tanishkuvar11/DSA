class Solution {
    public String largestNumber(int[] nums) 
    {
        String[] n=new String[nums.length];

        int i=0;
        for(int x:nums)
        {
            n[i]=String.valueOf(x);
            i++;
        }

        Arrays.sort(n, (a,b)->(b+a).compareTo(a+b));

        if(n[0].equals("0"))
            return "0";

        StringBuilder ans=new StringBuilder();
        for(String a:n)
            ans.append(a);

        return String.valueOf(ans);
    }
}