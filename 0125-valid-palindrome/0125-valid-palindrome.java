class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c) || Character.isAlphabetic(c))
                sb.append(c);
        }
        int l = 0, r = sb.length()-1;
        while(l<=r){
            if(sb.charAt(l++)!=sb.charAt(r--))
                return false;
        }
        return true;
    }
}