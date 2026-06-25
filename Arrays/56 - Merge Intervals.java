class Solution {
    public int[][] merge(int[][] intervals) 
    {
        int[][] ans=new int[intervals.length][2];
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        ans[0][0]=intervals[0][0];
        ans[0][1]=intervals[0][1];
        int k=0;

        for(int i=1; i<intervals.length; i++)
        {
            if(ans[k][1]>=intervals[i][0]) 
                ans[k][1]=Math.max(ans[k][1], intervals[i][1]);
            else
            {
                k++;
                ans[k]=intervals[i];
            }
        }

        return Arrays.copyOf(ans, k+1);
    }
}