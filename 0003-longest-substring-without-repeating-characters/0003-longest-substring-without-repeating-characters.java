class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()) return 0;
        int res = Integer.MIN_VALUE;
        int len = s.length();
        Set<Character> set = new HashSet<>();
        
        int left = 0 , right = 0;
        
        while(right < len && left < len){
            char c = s.charAt(right);
            if(set.add(c)){
             res = Math.max(res, set.size());
             right++;
            } else {
                set.remove(s.charAt(left++));
            }
        }
       return res;        
    }
}