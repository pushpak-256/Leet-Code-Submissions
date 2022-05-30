class Solution {
    public  static int diagonalSum(int[][] mat) {
        int L = mat.length - 1;
        int FirstDiagoSum = 0;
        int SecondDiagoSum = 0;

        for (int i = 0; i < mat.length; i++) {

            FirstDiagoSum += mat[i][i];

            if (i != L)  // skipping for mat[i][i];Center element in square matrix
            {
                SecondDiagoSum += mat[i][L];
            } 
            L--;
        }
        return FirstDiagoSum + SecondDiagoSum;
    }
}