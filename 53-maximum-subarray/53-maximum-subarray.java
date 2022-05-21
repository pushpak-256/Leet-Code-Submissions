class Solution {
    public int maxSubArray(int[] arr) {
        int max = arr[0];
        int curr=max;
      for(int i=1;i<arr.length;i++)
      {
        curr=Math.max(arr[i],curr+arr[i]);
        max=Math.max(max,curr);
      }
      return max;
    }
}