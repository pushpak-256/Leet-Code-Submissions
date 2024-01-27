class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Comparator<Integer> c =(a,b)->b-a;
        PriorityQueue<Integer> pq = new PriorityQueue<>(c);
        for(int num : nums){
            pq.add(num);
        }
        while(k-- -1>0){
            pq.poll();
        }
        return pq.poll();
    }
}