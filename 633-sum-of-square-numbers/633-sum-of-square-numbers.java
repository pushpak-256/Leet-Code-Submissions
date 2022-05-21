class Solution {
    public boolean judgeSquareSum(int c) {
    Set <Integer> set = new HashSet<Integer>();
    for(int i=0;i<=Math.sqrt(c);i++)
    {
      int num=i*i;
      set.add(num);
      if(set.contains(c-num))return true;
    }
      return false;
    }
}