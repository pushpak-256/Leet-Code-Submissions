class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums== null || nums.length==0) return 0;
        int max = 1;
        Set<Integer> set = new HashSet<>();        
   
        for(int num : nums)
            set.add(num);
        
        for(int num : nums){
           int temp = num;
           int count = 1;
            
            while(set.remove(--temp))// look left
                count++;
            
            temp = num;
            while(set.remove(++temp))//look right
                  count++;
            
           max = Math.max(count,max);
        }
        
        return max;
    }
}