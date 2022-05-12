class Solution {
    public int[] twoSum(int[] a, int t) {
        int left = 0 ;
        int right = a.length-1;
        int [] res = new int [2];
        
      while(left<=right)
      {
        int sum =a[left]+a[right];
        if(t==sum)
        {
          res[0]=1+left;
          res[1]=1+right;
          return res;
        }
        else if(t>sum) left++;
        else right--;
      }
        return res;
    }
}