class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
         Set<Integer> set3 = new HashSet<>();
        
        for(int num : nums1)
            set1.add(num);
        
        for(int num : nums2){
            set2.add(num);
            if(set1.contains(num))
                set3.add(num);
        }
        
        int [] res = new int [set3.size()];
        int i = 0;
        for(int num : set3)
            res[i++] = num;
        
        return res;
    }
}