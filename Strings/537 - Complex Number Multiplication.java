class Solution {
    public String complexNumberMultiply(String num1, String num2) 
    {
        String real1=num1.substring(0, num1.indexOf('+'));   
        String real2=num2.substring(0, num2.indexOf('+'));
        int x1=Integer.valueOf(real1);
        int x2=Integer.valueOf(real2);

        String im1= num1.substring(num1.indexOf('+')+1, num1.length()-1);
        String im2= num2.substring(num2.indexOf('+')+1, num2.length()-1);
        int y1=Integer.valueOf(im1);
        int y2=Integer.valueOf(im2);

        int ax=x1*x2-y1*y2;
        int ay=x1*y2+x2*y1;

        String ans=String.valueOf(ax)+"+"+String.valueOf(ay)+"i";
        return ans;
    }
}