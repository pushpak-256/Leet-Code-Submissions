class Solution {
    public int maximumWealth(int[][] acc) {
        int max =Integer.MIN_VALUE;
      
      for(int i =0;i<acc.length;i++)
      {
        int curr=0;
        for(int j=0;j<acc[i].length;j++)
        {
          curr+=acc[i][j];
        }
        max=Math.max(curr,max);
      }
        return max;
    }
}