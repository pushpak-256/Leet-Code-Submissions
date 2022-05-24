class Solution {
    public int findMin(int[] nums) {
      int low = 0 ;
      int high= nums.length-1;
      
      if(nums[low]<nums[high])return nums[low];
      
      while(low<high)
      {
        int mid = low + (high-low)/2;
        int curr = nums[mid];
        //Roatate, and hence low must be in right part
       if(curr>nums[high])
       {
         low=mid+1;
       } 
       else if (curr<nums[high])
       {
         high=mid;
       }
        else high--;
      }
      return nums[low];
    }
}