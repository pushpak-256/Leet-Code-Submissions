class Solution {
    public double average(int[] salary) {
      int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
      double sum =0;
      for(int a : salary)
      {
        sum+=a;
        min=Math.min(min,a);
        max=Math.max(max,a);
      }
      return (sum-min-max)/(salary.length-2);
    }
}