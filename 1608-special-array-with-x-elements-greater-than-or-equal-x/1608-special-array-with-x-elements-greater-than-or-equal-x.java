class Solution {
    public int specialArray(int[] nums) {
        int aNums=nums.length-1;
        int res =-1;
      
        for(int i=0;i<=nums.length;i++)
        {
          int count=0;
            for(int j =0;j<nums.length;j++)
          { 
            if(nums[j]>=i)
            {
              count++;
            }
          }
          if (count==i) {res=i;}
        }
      return res;
    }
}