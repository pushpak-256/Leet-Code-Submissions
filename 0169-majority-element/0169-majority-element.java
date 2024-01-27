class Solution {
    public int majorityElement(int[] nums) {
        int res = 1;
        int n = nums.length / 2;

        Arrays.sort(nums);
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (res > n) {
                return curr;
            } else if (nums[i] == curr) {
                res++;
            } else {
                curr = nums[i];
                res = 1;
            }

        }
        return curr;
    }
}