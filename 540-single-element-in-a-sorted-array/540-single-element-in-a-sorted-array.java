class Solution {
    public int singleNonDuplicate(int[] nums) {
     int low =0, high =nums.length-1;
      while(low<high)
      {
        int mid =(low+high)>>>1;
        /*
        if mid is even mid^1== odd ; mid+1
      else mid is odd  mid^1== even; mid-1
        */
        if(nums[mid]==nums[mid^1])
        {
          low=mid+1;
        }
        else high=mid;
      }
      return nums[low];
    }
}