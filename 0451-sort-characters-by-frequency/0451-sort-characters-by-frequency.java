class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
          map.put(c,map.getOrDefault(c,0)+1);
        
        Comparator <Character> compare = (a,b)->{
            int count = map.get(b)-map.get(a);
            if(count==0)
                return a-b;
            return count;
            };
        
        PriorityQueue <Character> pq = new PriorityQueue<>(compare);
        
        for(char c : s.toCharArray()){
             pq.add(c);
        }
        
        while(!pq.isEmpty()){
            sb.append(pq.poll());
        }
        return sb.toString();
    }
}