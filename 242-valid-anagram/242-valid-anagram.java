class Solution {
    public boolean isAnagram(String s, String t) {
      
     if (s.length()!=t.length())return false;
      
      int [] arr = new int [128];
      
      for(int i=0;i<s.length() ;i++)
      {
        arr[s.charAt(i)]+=1;
        arr[t.charAt(i)]-=1;
      }
      
       for(int i=0;i<s.length();i++)
      {
        if(arr[s.charAt(i)]!=0)return false;
      }
      
      return true;
    }
}