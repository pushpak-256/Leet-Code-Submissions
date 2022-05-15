class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i =1 ;i+1<arr.length;++i)
          if (arr[i]>arr[i+1])
            return i;
      return -1;
    }
}