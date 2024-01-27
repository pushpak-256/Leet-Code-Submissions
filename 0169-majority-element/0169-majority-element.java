class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int n = nums.length/2;
       /* if(n>0)
            n = nums.length/2+1;
        else 
            n = nums.length/2;
        */
        for(int i =0;i<nums.length;i++){
            res = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    res++;
                }
             if(res>n)
                return nums[i];
            }
        }
        return res;
    }
}