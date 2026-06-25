class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)
                l.add(matrix[top][j]);
            top++;

            for (int j = top; j <= bottom; j++)
                l.add(matrix[j][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    l.add(matrix[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--)
                    l.add(matrix[j][left]);
                left++;
            }
        }

        return l;
    }
}