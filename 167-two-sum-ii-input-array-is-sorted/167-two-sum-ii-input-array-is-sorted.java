class Solution {
    public int[] twoSum(int[] a, int t) {
        int left = 0 ;
        int right = a.length-1;
        int [] res = new int [2];
        while(left<right)
        {
           if ((a[left]+a[right])==t) 
           {
             res[0]=++left;
             res[1]=++right;
             return res;
           }            
          else if ((a[left]+a[right])>t){right--;}
          else{left++;}
          
        }
            return res;
    }
}