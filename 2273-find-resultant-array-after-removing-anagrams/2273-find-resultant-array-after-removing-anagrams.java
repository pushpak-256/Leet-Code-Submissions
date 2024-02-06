class Solution {
    public String generateHash(String s){
        char [] arr = new char[26];
        for(char c : s.toCharArray())
            arr[c-'a']++;
        return String.valueOf(arr);
    }
    
    public List<String> removeAnagrams(String[] arr) {
     LinkedList <String> list = new LinkedList<>();
     
    if(arr==null || arr.length<0)
         return list;
    
     String hash = generateHash(arr[0]);
     list.add(arr[0]);
        
    for(int i = 1;i<arr.length;i++){
        String temp = generateHash(arr[i]);
        if(temp.equals(hash)){
            continue;
        } else{
            hash = temp;
            list.add(arr[i]);
        }
    }
        
     return list;   
    }
}