class Solution {
    public int triangleNumber(int[] nums) {
      Arrays.sort(nums);
      int count =0;
      for(int high=nums.length-1;high>1;high--)
      {
          int low =0;
          int k = high-1;
        while(low<k)
        {
          if(nums[low]+nums[k]>nums[high])
          {
            count+=k-low;
            k--;
          }
          else low++;
        }
      }
      return count;
    }
}