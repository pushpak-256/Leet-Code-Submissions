class Solution {
 	 public static int[] sortedSquares(int[] nums) {
		 if (nums.length==1) { nums[0]=nums[0]*nums[0];return nums;}
	        int left = 0;
	        int right = nums.length-1;
	        int [] res = new int [nums.length];
	        int i = right;
	        while (left<=right)
	        {
	            if (Math.abs(nums[right])>Math.abs(nums[left]) )
	            {
	                res[i--]=nums[right]*nums[right];
	                right--;
	             }
	            else if(Math.abs(nums[right])<Math.abs(nums[left])) 
	            {
	             res[i--]=nums[left]*nums[left];  
	                 left++;
	            } 
	            else   {res[i--]=nums[left]*nums[left]; left++;;}  
	        }
	        return res;
	 }
}