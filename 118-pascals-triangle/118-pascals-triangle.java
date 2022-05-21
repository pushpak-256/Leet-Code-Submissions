class Solution {
    public List<List<Integer>> generate(int n) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> def = new ArrayList<>();
      def.add(1);
      res.add(def);

      for(int i =1;i<n;++i)
      {
         List<Integer> prev = res.get(i-1);
         List<Integer> curr = new ArrayList<>();
         int index = 1;
         int nums =i-1;
         curr.add(1);
        while(nums -- >0)
        {
          int val=prev.get(index)+prev.get(index-1);
          curr.add(val);
          index++;
        }
         curr.add(1);
         res.add(curr);
      }
      return res;
    }
}