class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
          map.put(c,map.getOrDefault(c,0)+1);
        
        Comparator <Character> compare = (a,b)->map.get(b)-map.get(a);
        PriorityQueue <Character> pq = new PriorityQueue<>(compare);
        pq.addAll(map.keySet());
        
        while(!pq.isEmpty()){
            char x = pq.poll();
            int count = map.get(x);
            while(count-->0)
               sb.append(x);
        }

        return sb.toString();
    }
}