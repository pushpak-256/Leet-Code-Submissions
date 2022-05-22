class Solution {
    public int firstMissingPositive(int[] nums) {
      
      Set<Integer> hs = new HashSet<>();
       int res =1;
      
      for(int i =0 ;i<nums.length;i++)
      {
        if(nums[i]>0)
        hs.add(nums[i]);
      }
     
      while(res<=nums.length)
      {
        if(!hs.contains(res)) break;
        else res++;
      }
      
      return res;
    }
}