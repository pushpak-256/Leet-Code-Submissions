class Solution {
    public int largestPerimeter(int[] nums) {
/*
we are supposed to find sum of largest sides forming a valid triangle
*/
      Arrays.sort(nums);
      for(int i =nums.length-1;i>1;i--)
      {
        if(nums[i]<nums[i-1]+nums[i-2])
          return nums[i]+nums[i-1]+nums[i-2];
      }
      return 0;
    }
}