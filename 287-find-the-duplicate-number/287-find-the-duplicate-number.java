class Solution {
    public int findDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<Integer>();
      for(int a : nums)
      {
        if(!set.add(a))
        {
          return a;
        }
      }
      return -1;
    }
}