class Solution {
    public int minimumPushes(String word) 
    {
        int l=word.length();

        if(l>8)
        {
            HashSet<Character> set=new HashSet<>();
            for(int i=0; i<l; i++)
                set.add(word.charAt(i));

            int distinct=set.size();

            if(distinct<=8)
                return l;

            else
            {
                HashMap<Character, Integer> map=new HashMap<>();
                for(int i=0; i<l; i++)
                    map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0)+1);

                int[] arr=new int[distinct];
                int k=0;
                for(char x:map.keySet())
                    arr[k++]=map.get(x);

                Arrays.sort(arr);
                int rem=distinct;
                int count=0, c=0;

                while(rem>8)
                {
                    int last=rem/8;
                    if(rem%8==0)
                        count+=arr[c]*(last);
                    else
                        count+=arr[c]*(last+1);   
                    c++;
                    rem--;
                }

                for(int i=c; i<arr.length; i++)
                    count+=arr[i];

                return count;                
            }            
        }

        else
            return l;
    }
}