class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> a=new ArrayList<>();
        a.add(1);

        for(int i=1; i<=rowIndex; i++)
        {
            a.add(1);

            for(int j=i-1; j>0; j--)
                a.set(j, a.get(j-1)+a.get(j));
        }

        return a;
    }
}