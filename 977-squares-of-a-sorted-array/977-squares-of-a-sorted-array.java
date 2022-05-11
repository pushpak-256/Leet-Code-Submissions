class Solution {
    public int[] sortedSquares(int[] nums) {
      int left  = 0;
      int right = nums.length-1;
      int res [] = new int[nums.length];
      int index = right;
      while (left<=right)
      {
         int r =Math.abs(nums[right]);
         int l = Math.abs(nums[left]);
        if(r>l)
        {
          res[index--]=r*r;
          right--;
        }
        else if (l>r)
        {
          res[index--]=l*l;
          left++;
        }
        else 
        {
          res[index--]=l*l;
          left++;
        }
      }
      return res;
    }
}