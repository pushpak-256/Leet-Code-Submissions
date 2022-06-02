class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
          for (int a : nums)
          {
            int len = (int)Math.log10(a)+1;
            if((len^1)==(len+1))
            {
              count++;
            }
          }
        return count;
    }
}