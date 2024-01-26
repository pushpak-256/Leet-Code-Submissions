class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length()==0) return true;
        
       char [] sArr = s.toCharArray();
       char [] tArr = t.toCharArray();
        int s1 = 0, t1 = 0;
        
        while(s1< s.length() && t1<t.length())
          if(tArr[t1++]==sArr[s1])
              s1++; 
            t1++;
     
        return s1==s.length();
    }
}