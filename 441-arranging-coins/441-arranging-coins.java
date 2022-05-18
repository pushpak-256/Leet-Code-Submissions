class Solution {
    public int arrangeCoins(int n) {
    int row=1;
      while(n>0)
      {
        /*
          $
          $$
          for each row , reduce coins by , n-coins,
          if n-coins < 0 break
          
          return row-1; 
        */
       if(n-row<0)break;
       else
       {
        n=n-row; 
        row++;
       }
      }
      return row-1;
    }
}