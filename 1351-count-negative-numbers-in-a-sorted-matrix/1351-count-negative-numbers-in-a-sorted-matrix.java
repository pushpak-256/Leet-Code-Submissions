class Solution {
 	public int countNegatives(int[][] grid) {
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
      
			int low = 0;
      int high = grid[i].length - 1;
      
			while (low <= high) 
      {
				int mid = (low + high) / 2;
				if (grid[i][mid] < 0) 
          high = mid - 1;	
        else
					low = mid + 1;
			}
			res += grid[i].length - low;
      /*low will always come at index of first -ve num,
        hence res = arr.length-low;
      */
		}
		return res;
	}
}