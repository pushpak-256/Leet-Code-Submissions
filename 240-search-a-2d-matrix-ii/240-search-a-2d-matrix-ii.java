class Solution {
    public boolean searchMatrix(int[][] mat, int t) 
    {
     int i = 0, j= mat[i].length-1;   
     while(i<mat.length && j>=0)
     {
      if(mat[i][j]==t)return true;
      else if(mat[i][j]>t)j--;
      else i++;
     }
     return false;
    }
}