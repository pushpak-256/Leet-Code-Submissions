class Solution {
    public int lengthOfLongestSubstring(String s) {
	     if(s.length()<=1) return s.length();
       Set <Character> set = new HashSet<>();
       int right =0, left=0,max=-1;
       while(right<s.length())
       {
         char c = s.charAt(right);
         if(!set.contains(c)) 
         {
            set.add(c);
            max= Math.max(max, set.size());
            right++; //move forward
         }
         else 
            set.remove(s.charAt(left++));
       }
       return max;
    }
}