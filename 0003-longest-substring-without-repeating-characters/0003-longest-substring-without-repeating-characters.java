class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      LinkedList <Character> set = new LinkedList<>();
        int res = 0, i = 0;
        char [] arr = s.toCharArray();
        
        while(i < arr.length){
            if(!set.contains(arr[i])) {
                set.add(arr[i++]);
                res = Math.max(res,+set.size()); 
             } else {
                set.removeFirst();
             }
        }
        return res;
    }
}