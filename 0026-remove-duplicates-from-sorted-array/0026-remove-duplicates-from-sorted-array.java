class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int res = 1;
        int head = 1;
        for(int i =1;i<nums.length;i++){
            if(curr<nums[i]){
                nums[head++]=nums[i];
                res++;
                curr = nums[i];
            } 
        }
        return res;
    }
}