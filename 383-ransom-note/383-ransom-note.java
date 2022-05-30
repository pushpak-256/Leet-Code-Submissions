class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     
      boolean res = true;
      int [] arr = new int [128];//cosume more space
      
      for(char c : magazine.toCharArray())
      {
        arr[c]++;  // hence decrease Time , space-time trade off 
      }

      for(char c : ransomNote.toCharArray())
      {
        if(arr[c]>0)
        arr[c]--;
        else return false;
      }
      
      return res;
    }
}