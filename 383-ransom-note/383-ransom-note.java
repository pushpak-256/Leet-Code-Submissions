class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     
      boolean res = true;
      int [] arr = new int [26];
      
      for(char c : magazine.toCharArray())
      {
        arr[c-'a']++;
      }

      for(char c : ransomNote.toCharArray())
      {
        if(arr[c-'a']>0)
        arr[c-'a']--;
        else return false;
      }
      
      return res;
    }
}