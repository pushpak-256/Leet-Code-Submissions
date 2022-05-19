class Solution {
    	public boolean searchMatrix(int[][] matrix, int T) {
	      boolean res =false;
	      int len = matrix.length;
	       for(int i =0;i<len;++i)
	       {
	         int end = matrix[i].length-1;
	         if(T>=matrix[i][0] && T<=matrix[i][end])
	         {
	           //might in this one
	           int low =0;
	           int high=end;
	           while(low<=high)
	           {
	            int mid = low + (high-low)/2;
	            int curr = matrix[i][mid];
	             if(curr==T)
	             {
	               res=!res;
	               break;
	             }
	             else if(curr>T)high=mid-1;
	             else low=mid+1;
	           }
	           break;
	         }
	         else continue;
	       }
	      return res;
	    }
}