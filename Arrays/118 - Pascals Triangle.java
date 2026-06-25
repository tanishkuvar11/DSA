class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> l=new ArrayList<>();

        for(int i=0; i<numRows; i++)
        {
            List<Integer> a=new ArrayList<>();

            for(int j=0; j<=i; j++)
            {
                if(j==0 || j==i)
                    a.add(j, 1);

                else
                    a.add(l.get(i-1).get(j-1) + l.get(i-1).get(j));
            }

            l.add(a);
        }

        return l;      
    }
}