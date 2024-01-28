class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums== null || nums.length==0) return 0;
       int res = 1;
       Arrays.sort(nums);
       Set<Integer> set = new HashSet<>(); 
        set.add(nums[0]);
       int l = 0;
        for(int i = 1; i<nums.length;i++){
            if((Math.abs(nums[i]-nums[i-1]))==1 || Math.abs(nums[i]-nums[i-1])==0 ){
                set.add(nums[i]);
                res = Math.max(res,set.size());
            } else {
                set.clear();
                set.add(nums[i]);
            }
        }
        return res;
    }
}