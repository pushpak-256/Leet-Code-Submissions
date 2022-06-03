class Solution {
    public char findTheDifference(String s, String t) {
        int [] arr = new int [126];
        for(char c : s.toCharArray())
        {
          arr[c]++;
        }
        for(char c : t.toCharArray())
        {
          arr[c]--;
        }
        for(int i =0;i<arr.length;i++)
        {
          if(arr[i]!=0)
          {
            char res =(char)i;
            return res;
          }
        }
      return '0';
    }
}