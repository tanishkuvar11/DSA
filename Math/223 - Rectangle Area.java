class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int Ara = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int Arb = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);

        int l = Math.max(ax1, bx1);
        int r = Math.min(ax2, bx2);
        int w = r - l;

        int b = Math.max(ay1, by1);
        int t = Math.min(ay2, by2);
        int h = t - b;

        int Ari = (w > 0 && h > 0) ? (w * h) : 0;

        return Ara + Arb - Ari;
    }
}