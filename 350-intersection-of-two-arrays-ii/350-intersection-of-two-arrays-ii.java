class Solution {
	public int[] intersect(int[] a, int[] b) {
  Map<Integer,Integer>map = new HashMap<>();
  List <Integer>ll = new ArrayList<>(); 
    for(int i :a)
    {
      if(map.containsKey(i))
      {
        map.put(i,map.get(i)+1);
      }
      else map.put(i,1);
    }
    
     for(int i :b)
    {
      if(map.containsKey(i) && map.get(i)>0)
      {
        map.put(i,map.get(i)-1);
         ll.add(i);
      }
    }
     int res [] = new int [ll.size()];
     int index=0;
    for(int i:ll)
    {
      res[index++]=i;
    }
    return res;
}
}