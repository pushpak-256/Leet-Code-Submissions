class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int len = letters.length;  
      if(letters[len-1]<=target) return letters[0];
      int low = 0, high =len-1,mid;
      char res = letters[0];
      while(low<=high)
      {
         mid=(low+high)>>>1;
         char curr = letters[mid];
         if(target>=curr)
         {
           low=mid+1;
         }
         else if(target<curr)
         {
           res=curr;
           high=mid-1;
         }
      }
      return res;
    }
}