class Solution {
    public int firstUniqChar(String s) {
      int [] arr = new int [128];
      for(int i =0; i<s.length(); i++)
      {
        char c = s.charAt(i);
        arr[c]++;
      }
      for(int i =0; i<s.length(); i++)
      {
        char c = s.charAt(i);
        if(arr[c]==1)return i;
      }
      return -1;
    }
}