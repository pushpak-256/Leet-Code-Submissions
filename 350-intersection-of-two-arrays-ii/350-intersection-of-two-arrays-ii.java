class Solution {
    public int[] intersect(int[] A, int[] B) {
      
      Map <Integer,Integer> map = new HashMap<>();
      List <Integer> list = new ArrayList<>();
      
      for(int a : A)
        {
          map.put(a,map.getOrDefault(a,0)+1); 
        }
      
      for(int a : B)
        {
         if(map.containsKey(a) && map.get(a)>0)
         {
           map.put(a,map.get(a)-1);
           list.add(a);
         }
        }
      
      int index=0;
      int [] res = new int [list.size()];
      
      for(int a : list){res[index++]=a;}
      
      return res;
    }
}