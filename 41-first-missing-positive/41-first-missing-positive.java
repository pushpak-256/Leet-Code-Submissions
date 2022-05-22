class Solution {
     public int firstMissingPositive(int[] nums) {
	  // nums[]={1,2,3}
       int res =1;
       
      for(int i =0 ;i<nums.length;)
      {
        //to avoid indexOutOfBound 
        // nums[2]=3,  3<=nums.length && nums[i]=0 , nums[0-1] 
        //&& increment i , only when nums[i]==i-1;

        if(nums[i]<=nums.length
           && nums[i]>0 && nums[i]!=i+1 && nums[nums[i]-1]!=nums[i])
        {
          int temp = nums[nums[i]-1];
          nums[nums[i]-1]=nums[i];
          nums[i]=temp;
        }
        else i++;
      }
	    
     for(int i =0 ;i< nums.length;i++)
      {
        if(nums[i]!=res)
         return res;
        else res+=1;
      }
       
      return res;
       
    }
}