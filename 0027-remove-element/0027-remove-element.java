class Solution {
    public int removeElement(int[] nums, int val) {
        int head = 0;
        for(int num : nums){
            if(num!=val){
                nums[head++] = num;
            }
        }
        return head;
    }
}