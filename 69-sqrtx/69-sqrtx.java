class Solution {
    public int mySqrt(int num) {
       if(num<=1)return num;
       //Using long is key here 
        long left = 1;
        long right = num;
        int res =0;
        while (left <= right)
        {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid;
            if (sqr <= num)
            {
             res=(int)mid;
             left=mid+1;
            }
            else if (sqr > num)
             right = mid - 1;
            else
             left = mid + 1;
        }
        return res;
    }
}