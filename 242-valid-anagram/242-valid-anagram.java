class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        int index []= new int [26];
        for(char c :s.toCharArray() )
        {index[c-'a']++;}
        for(char c :t.toCharArray() )
        {index[c-'a']--;}
        for(int x : index)
        {if(x!=0) return false; }
        return true;
    }
}