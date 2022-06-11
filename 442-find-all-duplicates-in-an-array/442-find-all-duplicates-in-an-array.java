class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int [] temp = new int [nums.length+1];
      List<Integer> list = new ArrayList<>();
     
      for(int i=0;i<nums.length;i++)
      {
        temp[nums[i]]++;
        if(temp[nums[i]]>1)
        {
          list.add(nums[i]);
        }
      }
      return list;
    }
}