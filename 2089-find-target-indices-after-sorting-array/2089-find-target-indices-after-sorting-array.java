class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
      
        boolean firstIndex=true;
      
        for(int i : getIndex(nums,target,firstIndex))
        {
          if(!res.contains(i)){
            res.add(i);
          }
        }
        
        for(int i : getIndex(nums,target,!firstIndex))
        {
          if(!res.contains(i)){
            res.add(i);
          }
        }
       Collections.sort(res);
      return res;
    }
  
   public List<Integer> getIndex(int [] nums, int target,boolean firstIndex)
      {
      
       List<Integer>list = new ArrayList<>();
     
        int low = 0,high=nums.length-1,mid;
      
          while(low<=high)
          {
           mid=(low+high)>>>1;
             if(nums[mid]>target)
             {
               high=mid-1;
             }      
             else if(nums[mid]<target)
             {
               low=mid+1;
             }
             else if(nums[mid]==target)
             {
               if(firstIndex)
               {
                 list.add(mid);
                 high-=1;
               }
               else 
               {
                 list.add(mid);
                 low+=1;
               }
             }
          }
          return list;
      }
}