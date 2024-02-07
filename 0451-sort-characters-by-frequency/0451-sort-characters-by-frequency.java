class Solution {
    public String frequencySort(String s) {
        Map <Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        Comparator <Character> compare = (b,a)->{return map.get(a)-map.get(b);};
        PriorityQueue<Character> pq = new PriorityQueue<>(compare);
        
        pq.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()){// here is catch
            char x = pq.poll();
            int limit = map.get(x);
            while(limit-->0)
             sb.append(x);
        }
        
        return sb.toString();
        
    }
}