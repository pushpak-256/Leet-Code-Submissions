
   class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length; // to make sure k is less than arrayLength
        rv(nums ,0,nums.length-1);
        rv(nums ,0,k-1);
        rv(nums ,k,nums.length-1);
    }
    public void rv (int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
