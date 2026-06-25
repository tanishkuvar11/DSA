class Solution {
    public int[] intersection(int[] arr1, int[] arr2) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        
        for(int i=0; i<arr1.length; i++)
	        map.put(arr1[i], 1);
            
        for(int i=0; i<arr2.length; i++)
        {
	        if(map.getOrDefault(arr2[i], 0)==1)
		        map.put(arr2[i], 2);
        }

        for(Integer i:map.keySet())
        {
	        if(map.get(i)==2)
                l.add(i);
        }

        int[] ans=new int[l.size()];
        for(int i=0; i<l.size(); i++)
            ans[i]=l.get(i);

        return ans;    
    }
}