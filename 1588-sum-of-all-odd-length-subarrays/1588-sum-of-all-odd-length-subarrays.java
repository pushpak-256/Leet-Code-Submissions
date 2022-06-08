class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            result +=
              arr[i] * (((i + 1) * (arr.length - i)+1)/2);
        }
        return result;
    }
}