class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        //fill Map
        for(String word : words){
           map.put(word, map.getOrDefault(word,0)+1);
        }
        
        // compartor which will compare most frequent words, if frequency is same compare lexicographically
        Comparator <Map.Entry<String,Integer>> c = (e1,e2)->{
            if(e1.getValue()==e2.getValue()) //if count same
            return e1.getKey().compareTo(e2.getKey());

            return e2.getValue()-e1.getValue();// otherwise compare count
        };

        // fill priority queue
        PriorityQueue <Map.Entry<String,Integer>> pq = new PriorityQueue<>(c);
        pq.addAll(map.entrySet());

        // put element in result set
        while(res.size()<k && !pq.isEmpty())
         res.add(pq.poll().getKey());
   
        return res;
    }
}