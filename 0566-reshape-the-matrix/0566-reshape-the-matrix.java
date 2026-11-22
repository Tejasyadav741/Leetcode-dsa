class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] reshaped = new int[r][c];
        int outRow = 0;
        int outCol = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshaped[outRow][outCol] = mat[i][j];
                outCol++;
                if (outCol == c) {
                    outCol = 0;
                    outRow++;
                }
            }
        }
        return reshaped;
    }
}