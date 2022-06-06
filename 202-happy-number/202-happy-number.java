class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        while(n!=1)
        {
          int newNum=0;
          while(n>0)
          {
            int digit = n%10;
            n/=10;
            newNum+=Math.pow(digit,2);
          }
          if(newNum==1)return true;
          else if (!set.add(newNum)) return false;
          n=newNum;
        }
      if(n==1)return true;
      return false;
    }
}