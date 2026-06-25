class Solution {
    public String stringHash(String s, int k) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int) s.length(); i += k) {
            int j = i;
            int sum = 0;
            while (j < i + k) {
                sum += ((int) s.charAt(j) - 97);
                j++;
            }
            sb.append((char) ((sum % 26) + 97));
        }

        return sb.toString();
    }
}