class Solution {
	public int[] intersect(int[] a, int[] b) {
		Map <Integer, Integer> map  = new HashMap<Integer, Integer>();
		List<Integer>ll = new LinkedList<Integer>();
		for (int x : a) {
			if (map.containsKey(x)) {map.put(x,map.get(x)+1);}
			else map.put(x, 1);
		}

		for (int x : b) {
			if (map.containsKey(x) && map.get(x)>0)
			{
				map.put(x,map.get(x)-1);
				ll.add(x);
			}
		}
		int []res = new int [ll.size()];
		int i =0;
        for(int x : ll) {res[i++]=x;}		
		return res;
	}
}