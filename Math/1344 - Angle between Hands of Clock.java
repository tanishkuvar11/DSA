class Solution {
    public double angleClock(int hour, int minutes) 
    {
        double hDist;
        double mDist;

        hDist = (hour%12)*30.0 + 30.0*((double)minutes/60);
        mDist = minutes*6.0;

        return Math.min(Math.abs(hDist-mDist), 360-Math.abs(hDist-mDist));
    }
}