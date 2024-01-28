class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums== null || nums.length==0) return 0;
        int max = 1;
        Set<Integer> set = new HashSet<>();        
   
        for(int num : nums)
            set.add(num);
        
        for(int num : nums){
           int temp = num;
           int count = 0;
           if(!set.contains(temp-1)){ // this num is start of sequence
               while(set.contains(temp++))
                   count++;
               
               max = Math.max(max,count);
           }
        }
        
        return max;
    }
}