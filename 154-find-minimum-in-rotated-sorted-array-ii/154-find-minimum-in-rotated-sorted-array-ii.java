class Solution {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        
        //if array is unsorted then, first element must be MIN
        if (nums[lo] < nums[hi]) return nums[lo];
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] > nums[hi]) //[2,3,0,1]
            {
                lo = mid + 1;
            }
           else if (nums[mid] < nums[hi]) //make hi = mid
           {
                hi = mid;
           } 
          else // for duplicates [1,2,2,3]
           hi--;
        }
        
        return nums[hi];
    }
}