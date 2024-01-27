class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] heap = new int [26];
        
        for(char c : magazine.toCharArray()){
            heap[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
           if(heap[c-'a']==0)
               return false;
            else heap[c-'a']--;
        }
        return true;
    }
}