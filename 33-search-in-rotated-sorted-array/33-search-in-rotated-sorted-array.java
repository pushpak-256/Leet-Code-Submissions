class Solution {
    public int search(int[] nums, int t) {
      int low =0;
      int high=nums.length-1;
      while(low<=high)
      {
        int mid =low+(high-low)/2;
        int curr =nums[mid];
        if(curr==t)return mid;
        else if(curr>=nums[low])
        {
          if(t<curr && t>=nums[low])
            high=mid-1;
          else low = mid+1;
        }
        else if(curr<=nums[high])
        {
          if(t>curr && t<=nums[high])
            low=mid+1;
          else high=mid-1;
        }
      }
      return -1;
    }
}