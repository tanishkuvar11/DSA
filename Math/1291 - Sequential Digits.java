class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        int minLen = (int) Math.log10(low) + 1;
        int maxLen = (int) Math.log10(high) + 1;

        for (int len = minLen; len <= maxLen; len++) {
            for (int start = 1; start <= 10 - len; start++) {
                int num = 0;
                for (int d = start; d < start + len; d++)
                    num = num * 10 + d;

                if (num >= low && num <= high)
                    ans.add(num);
            }
        }

        return ans;
    }
}