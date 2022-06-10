class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0,
            j=0;//index added 
      
      StringBuilder sb = new StringBuilder();
      
      for(;i<w1.length() && j<w2.length();)
      {
        sb.append(w1.charAt(i++));
        sb.append(w2.charAt(j++));
      }
      
      if(i!=w1.length())
      {
        sb.append(w1.substring(i));  
      }
      if(j!=w2.length())
      {
        sb.append(w2.substring(j));  
      }
      
      return sb.toString();
    }
}