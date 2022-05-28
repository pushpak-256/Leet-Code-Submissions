class Solution {
    public List<List<Integer>> generate(int n) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> def1 = new ArrayList<>();
      def1.add(1);
      res.add(def1);
 
      for(int i=1;i<n;i++)
      {
        List<Integer> curr = new ArrayList<>();
        List<Integer> prev = res.get(i-1);
        
        curr.add(1);
        
        for(int j=1;j<i;j++)
        {
          curr.add(prev.get(j)+prev.get(j-1));
        }        
        
        curr.add(1);
        
        res.add(curr);
      }
      
      return res;
    }
}