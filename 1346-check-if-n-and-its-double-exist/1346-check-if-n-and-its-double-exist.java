class Solution {
    public boolean checkIfExist(int[] arr) {
      Set <Integer> hs = new HashSet<>();
      for (int x : arr) 
      {
        if(hs.contains(2*x) || (hs.contains(x/2) && x%2==0))
        return true;
        else hs.add(x);
      }
      return false;
   }
}