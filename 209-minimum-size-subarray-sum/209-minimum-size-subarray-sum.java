class Solution {
  	  public int minSubArrayLen(int target, int[] nums) {
	        int min = Integer.MAX_VALUE;
	        int sum =0;
	        int low =0;
	        int high =0;
        while(high<nums.length)
        {
          sum+=nums[high++];
          while(sum>=target)
          {
            min = Math.min(min,high-low);
            sum-=nums[low++];
          }
        }
	      return min==Integer.MAX_VALUE?0:min;
	    }
}