class Solution {
    public String freqAlphabets(String s) {
     
     StringBuilder sb = new StringBuilder();
        /* 
           1 + 96  a(97) 
          26 + 96 z(122)
        */
      int len = s.length()-1;
      for(int i=len; i>=0;)
      {
        
        if(Character.isDigit(s.charAt(i)))
        {
           int index = s.charAt(i)-'0';
           char curr = (char)(96+index);
           sb.append(curr);
            i--; 
         }
        else
        {
           String sub = s.substring(i-2,i);
           int index = Integer.parseInt(sub);
           char curr = (char)(96+index);
           sb.append(curr);
           i=i-3;
        }
      }
      return sb.reverse().toString();
    }
}