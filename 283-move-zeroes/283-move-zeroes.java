class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0;
     
     for(int x : nums)
     {
      if(x!=0)
      {
        nums[low++]=x;
      } 
     }
     
      for(int i=low;i<nums.length;i++)
      {
        nums[i]=0;
      }
      
    }
}