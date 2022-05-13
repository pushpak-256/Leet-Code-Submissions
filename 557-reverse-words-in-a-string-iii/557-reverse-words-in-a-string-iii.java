class Solution {
   	 public String reverseWords(String s) {
	        char [] arr = s.toCharArray();
	        int hook =0;
	        for (int i =0 ;i<arr.length;i++)
	        {
	         if(arr[i]==' ')
	         {
	          reverseSubString(arr,hook,i-1);
	          hook=i+1;
	         } 
	         else if (i == arr.length-1)
	         reverseSubString(arr,hook,i);
	        }
	      return new String (arr);
	    }
	    
	   public void reverseSubString(char [] arr , int left , int right )
	   {
	     while(left<right)
	     {
	       char temp = arr[right];
	       arr[right]=arr[left];
	       arr[left]=temp;
	       left++;
	       right--;
	     }
	   }
}