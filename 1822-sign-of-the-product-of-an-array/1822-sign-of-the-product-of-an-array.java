class Solution {
    public static int arraySign(int[] nums) {
        
      int negCount =0;
      for(int x : nums)
        {
            if(x<0)
            {
              negCount++;
            }
            else if(x==0)
            {
              return 0;
            }
        }
      
       return negCount%2==0?1:-1;
    }
}