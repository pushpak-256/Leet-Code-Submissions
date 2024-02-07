class Solution {
    public String frequencySort(String s) {
        Map <Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        Comparator <Character> compare = (b,a)->{
            int diff = map.get(a)-map.get(b);
            if(diff==0)
                return a-b;
            return diff;
        };
        
        PriorityQueue<Character> pq = new PriorityQueue<>(compare);
        
        for(char c : s.toCharArray())
            pq.add(c);
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty())
            sb.append(pq.poll());
        
        return sb.toString();
        
    }
}