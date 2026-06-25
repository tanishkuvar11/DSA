class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int ans=Integer.MAX_VALUE;
        for(int i=0; i<landStartTime.length; i++)
        {
            int landEndTime = landStartTime[i]+landDuration[i];
            for(int j=0; j<waterStartTime.length; j++)
            {
                int waterEndTime=Math.max(landEndTime, waterStartTime[j]) + waterDuration[j];

                ans = Math.min(ans, waterEndTime);

                int firstWaterEndTime = waterStartTime[j]+waterDuration[j];
                int secondLandEndTime = Math.max(firstWaterEndTime, landStartTime[i]) + landDuration[i];

                ans = Math.min(ans, secondLandEndTime);
            }
        }

        return ans;
    }
}