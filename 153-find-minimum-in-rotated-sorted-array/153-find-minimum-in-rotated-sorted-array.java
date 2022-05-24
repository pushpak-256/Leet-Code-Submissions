class Solution {
    public int findMin(int[] nums) {
      int low = 0 ;
      int high= nums.length-1;
      
      if(nums[low]<nums[high])return nums[low];
      
      while(low<high)
      {
        int mid = low + (high-low)/2;
        //Roatated, and hence low must be in right part
       if(nums[mid]>nums[high])
       {
         low=mid+1;
       } 
       else if (nums[mid]<nums[high])
       {
         high=mid;
       }
      
      }
      return nums[low];
    }
}