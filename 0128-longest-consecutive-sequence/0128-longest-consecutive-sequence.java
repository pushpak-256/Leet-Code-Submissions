class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums== null || nums.length==0) return 0;
        int max = 1;
        Set<Integer> set = new HashSet<>();        
   
        for(int num : nums)
            set.add(num);
        
        for(int num : nums){
            int count = 1;
            
            int temp = num;
            
            while(set.remove(--temp))
                count++;
            
            temp = num;
            while(set.remove(++temp))
                count++;
            
            max = Math.max(count,max);
            
        }
        
        return max;
    }
}