// { Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{

	
	public static void selectionSort(int[] arr, int n) {
		int i = 0, lastIndex = arr.length - 1; // of unsorted part of Array
		while (i <=lastIndex) {
			int maxIndex = i;
			for (; i <=lastIndex ; i++) {
				if (arr[maxIndex] < arr[i]) {
					maxIndex = i;
				}
			}
			swap(maxIndex, lastIndex, arr);
			i = 0;
			lastIndex--;
		}
	}

	public static void swap(int maxIndex, int lastIndex, int[] arr) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
	}
}