public class Temp
{
    int temp;
    int idx;

    public Temp(int temp, int idx)
    {
        this.temp=temp;
        this.idx=idx;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] ans=new int[temperatures.length];
        Stack<Temp> st=new Stack<>();
        st.push(new Temp(temperatures[0], 0));
        int index=0;

        for(int i=1; i<temperatures.length; i++)
        {
            while(!st.isEmpty() && temperatures[i]>st.peek().temp)
            {
                ans[st.peek().idx]=i-st.peek().idx;
                st.pop();
            }

            st.push(new Temp(temperatures[i], i));
        }

        return ans;
    }
}