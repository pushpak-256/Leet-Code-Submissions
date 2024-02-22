class Solution {
    public int findJudge(int n, int[][] trust) {
        int trustCount [] = new int [n+1];
        for(int [] arr : trust){
            trustCount[arr[0]]--;
            trustCount[arr[1]]++;
        }
        System.out.println(Arrays.toString(trustCount));
        for(int i =1; i<trustCount.length;i++){
            if(trustCount[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}