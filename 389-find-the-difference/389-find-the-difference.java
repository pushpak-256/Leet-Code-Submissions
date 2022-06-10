class Solution {
    public char findTheDifference(String s, String t) {
       int res =0; //taking int insted of char 
      for(char c : s.toCharArray())
        {
          res^=c;
        }
        for(char c : t.toCharArray())
        {
          res^=c;
        }
      return (char)res;
    }
}