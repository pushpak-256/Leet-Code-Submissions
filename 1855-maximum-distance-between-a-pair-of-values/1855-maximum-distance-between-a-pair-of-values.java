class Solution {
    public int maxDistance(int[] nums1, int[] nums2)
    {
      int max = 0;
      for (int i = 0; i < nums1.length; i++)
      {
          int curr = nums1[i];
          int low = i, hi = nums2.length-1;
          while (low <= hi)
          {
            int mid = low + (hi - low) / 2;
                if (curr <= nums2[mid])
                {
                  max = Math.max(max, mid - i);
                  low = mid + 1;
                } 
               else if (curr > nums2[mid])
                hi = mid - 1;
          }
      }
      return max;
    }
}