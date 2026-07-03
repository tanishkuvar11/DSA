class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();

        for(String s:strs)
        {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);

            if(map.containsKey(sorted))
                map.get(sorted).add(s);
            else
            {
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(sorted, l);
            }
        }       

        for(String s:map.keySet())
            ans.add(map.get(s));

        return ans;
    }
}