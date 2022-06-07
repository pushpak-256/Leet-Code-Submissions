class Solution {
    public int[] searchRange(int[] nums, int target) {
      boolean firstIndex=true;
     return new int[]
     {getIndex(nums,target,firstIndex),getIndex(nums,target,!firstIndex)};
    }
  
      public int getIndex(int [] nums, int target,boolean firstIndex)
      {
        int low = 0,high=nums.length-1,res=-1,mid;
      
          while(low<=high)
          {
           mid=(low+high)>>>1;
             if(nums[mid]>target)
             {
               high=mid-1;
             }      
             else if(nums[mid]<target)
             {
               low=mid+1;
             }
             else if(nums[mid]==target)
             {
               if(firstIndex)
               {
                 res=mid;
                 high=mid-1;
               }
               else 
               {
                 res=mid;
                 low=mid+1;
               }
             }
          }
          return res;
      }
}