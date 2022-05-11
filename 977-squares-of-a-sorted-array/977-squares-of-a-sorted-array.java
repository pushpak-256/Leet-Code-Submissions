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
          res[index--]=(int)Math.pow(r,2);
          right--;
        }
        else if (l>r)
        {
          res[index--]=(int)Math.pow(l,2);;
          left++;
        }
        else 
        {
          res[index--]=(int)Math.pow(l,2);
          left++;
        }
      }
      return res;
    }
}