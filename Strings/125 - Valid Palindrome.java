class Solution {
    public static void rev(char[] s, int l, int r)
    {
        if(l>=r)
            return;
            
	    char temp=s[r];
	    s[r]=s[l];
	    s[l]=temp;
	    rev(s, l+1, r-1);
	    
    }

    public boolean isPalindrome(String s) 
    {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr=s.toCharArray();
        rev(arr, 0, arr.length-1);

        String s2=new String(arr);
        if(s.equalsIgnoreCase(s2))
            return true;
        return false;           
    }
}