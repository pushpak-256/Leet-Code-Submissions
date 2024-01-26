class Solution {
    public int[] twoSum(int[] num, int t) {
        int l = 0, r=num.length-1;
        
        int sum;
        while(l<=r){
          sum = num[l] + num[r];
          
            if(sum>t)
                r--;
            else if(sum<t)
                l++;
            else if(sum==t)
                return new int[]{++l,++r};
              
        }
        
        return null;
    }
}