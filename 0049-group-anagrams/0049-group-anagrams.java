class Solution {
    
    public boolean isAnagram(String a,String b){
        
        if((a==null || b==null) || a.length()!=b.length())
            return false;
        
        int [] arr = new int[128];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)]++;
            arr[b.charAt(i)]--;
        }
        
        for(int i =0; i<arr.length;i++){
            if(arr[i]!=0)
                return false;
        }
        
        return true;
    }
    
    public List<List<String>> groupAnagrams(String[] arr) {
       
        List<List<String>> res = new LinkedList<>(); 
        for(int i = 0; i<arr.length; i++){
            List<String> temp = new LinkedList<>();
            if(arr[i]==null) continue;
            temp.add(arr[i]);
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]==null) continue;
                if(isAnagram(arr[i],arr[j])){
                    temp.add(arr[j]);
                    arr[j]=null;
                }
            }
            res.add(temp);
        }
        return res;
    }
}