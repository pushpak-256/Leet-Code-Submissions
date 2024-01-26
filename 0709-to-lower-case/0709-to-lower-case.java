class Solution {
    public String toLowerCase(String s) {
        /**  A - 65
             a - 97 
             diff = (+ -)32
        */
        
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if((c-'a')<0 && Character.isAlphabetic(c)){
                c =(char)((int)( c + 32));
            }
            sb.append(c);
        }
        return sb.toString();
    }
}