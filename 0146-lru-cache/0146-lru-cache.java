class LRUCache {

    protected static int capacity;
    protected LinkedHashMap <Integer,Integer> map = new LinkedHashMap<Integer,Integer>(capacity, 0.75f, true){
        
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e){
            return map.size()>capacity;
        }
    };

    
    public LRUCache(int capacity) {
      this.capacity = capacity;
    }
    
    public int get(int key) {
      return map.getOrDefault(key,-1);
    }
    
    
    public void put(int key, int value) {
       map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */