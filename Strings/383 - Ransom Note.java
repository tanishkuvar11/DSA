class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        if(magazine.contains(ransomNote))
            return true;

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0; i<ransomNote.length(); i++)
        {
            char s=ransomNote.charAt(i);
            int idx=magazine.indexOf(s);
            if(idx!=-1)
            {
                if(map.containsKey(s))
                    map.put(s, map.get(s)+1);
                
                else
                    map.put(s, 1);

                magazine=magazine.substring(0,idx)+"$"+magazine.substring(idx+1);
            }
        } 

        int sum=0;
        for(char s:map.keySet())
            sum+=map.get(s);

        if(sum==ransomNote.length())
            return true;
        
        return false;
    }
}