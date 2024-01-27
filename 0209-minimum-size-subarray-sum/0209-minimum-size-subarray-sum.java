class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0, sum = 0, res = Integer.MAX_VALUE;
        
        while(high < nums.length){
            sum += nums[high++];
            while(sum >= target){
                res = Math.min(res,high-low);
                sum -= nums[low++];
            }
        }
        return  res == Integer.MAX_VALUE?0:res;
    }
}