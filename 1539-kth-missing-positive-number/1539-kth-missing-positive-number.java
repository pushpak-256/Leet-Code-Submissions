class Solution {
    public int findKthPositive(int[] arr, int k) {
     Set <Integer> hs = new HashSet<>();
     List <Integer> al = new ArrayList<>();   
     int p=0;
      
        for(int x : arr)
        {hs.add(x);}
      
        while(al.size()<k)
        {
          p++;
            if(!hs.contains(p)){
                al.add(p);
            }
        }
        return al.get(k-1);
    }
}