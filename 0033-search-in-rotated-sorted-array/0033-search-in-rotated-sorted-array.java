class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1, low=0, mid;
        
        while(low<=high)
        {
          mid = (high+low)>>>1;    
            
           /*
            by convection if (mid == target) return mid;
            
            check 2 conditions, 
            
            1) if nums[low]>=curr
                {
                  t between these two  high = mid -1;
                  else low = mid +1;
                }
            2) nums[high]<=curr
                 t between these two  low = mid + 1;
                  else high = mid - 1;
           */
            
           int curr = nums[mid];
           
           if(curr == target) return mid;
           else if (nums[low]<=curr)
           {
              if(target>=nums[low] && target<curr)
                  high = mid - 1;
              else 
                  low = mid + 1;
           }
           else if (curr<=nums[high])
           {
              if(target>curr && target<=nums[high])
                  low = mid + 1;
               else
                   high = mid - 1;
           }
        }
        return -1;
    }
}