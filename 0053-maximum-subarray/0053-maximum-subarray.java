class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0], curr = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            curr = Math.max(nums[i], curr+nums[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
}