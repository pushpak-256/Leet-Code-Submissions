class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      Set <Character> set = new HashSet<>();
      int res = 0, l = 0, r = 0;
          
        while(r < s.length()){
            char c = s.charAt(r);
            if(set.add(c)) {
                r++;
                res = Math.max(res,set.size()); 
             } else {
                set.remove(s.charAt(l++));
             }
        }
        return res;
    }
}