class Solution {
    
    public String generateHash(String s){
        char [] arr = new char [128];
        for(char c : s.toCharArray())
            arr[c-'a']++;
        return String.valueOf(arr);
    }
    
    public List<List<String>> groupAnagrams(String[] arr) {
        // create a hash of each String, based on that way we will know if two string are anagram or not
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : arr){
            String hash = generateHash(s);
            if(map.containsKey(hash)){
                map.get(hash).add(s);
            } else {
                List<String> l = new LinkedList<>();
                l.add(s);
                map.put(hash,l);
            }
        }
        return new ArrayList<>(map.values());
    }
}