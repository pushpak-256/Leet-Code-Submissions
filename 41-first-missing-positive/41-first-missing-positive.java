class Solution {
    public int firstMissingPositive(int[] nums) {
       int res =1;
       int arr[] = new int [nums.length];
     
      for(int i =0 ;i< nums.length;i++)
      {
        if(nums[i]<=nums.length && nums[i]>0)
        arr[nums[i]-1]=nums[i];
      }
      
     for(int i =0 ;i< nums.length;i++)
      {
        if(arr[i]!=res)
        return res;
       else res++;
      }
      
      return res;
    }
}