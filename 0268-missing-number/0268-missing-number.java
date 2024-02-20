class Solution {
    public int missingNumber(int[] nums) {
        int [] seen = new int[nums.length+1];
        for(int num : nums){
            seen[num] = num;
        }
        
        for(int i =1; i<seen.length;i++)
            if(seen[i]<1)
                return i;
        
        return 0;
    }
}