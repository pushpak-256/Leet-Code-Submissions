class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i = 0, anchor = 0, max = -1;
        
        for(;i<nums.length;++i)
        {
         if(i>0 && nums[i-1]>=nums[i])
         {
             anchor = i;
         }   
           max = Math.max(max, i-anchor+1);
        }
        
        return max;
    }
}