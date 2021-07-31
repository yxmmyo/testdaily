public class Solution2_0731 {
    //力扣566. 重塑矩阵
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) {
            return mat;
        }
        int[][] ary = new int[r][c];
        for(int i = 0;i < m*n;i++) {
            ary[i/c][i%c] = mat[i/n][i%n];
        }
        return ary;
    }
}
