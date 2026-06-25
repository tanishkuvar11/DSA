class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int[] soln = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            int count = 0;

            for (int j = 0; j <= i; j++) {

                for (int k = 0; k <= i; k++) {

                    if (A[j] == B[k]) {
                        count++;
                    }
                }
            }

            soln[i] = count;
        }

        return soln;
    }
}