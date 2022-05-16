public class Solution {
    public int[] searchRange(int[] arr, int t) {
        return new int[]{firstIndex(arr,t),lastIndex(arr,t)};
    }
    public int firstIndex(int []arr,int t)
    {
      int index =-1;
      int low = 0;
      int high=arr.length-1;
      while(low<=high)
      {
        int mid = low +(high-low)/2;
        int num = arr[mid]; 
          if(num==t)
          {
           index =mid;   
           high=mid-1;//even if we found target, keep searching in left part (firstIndex)
          }
          else if(num<t) low=mid+1;
          else high=mid-1;
      }
      return index;
    }
   public int lastIndex(int []arr,int t)
    {
      int index =-1;
      int low = 0;
      int high=arr.length-1;
      while(low<=high)
      {
        int mid = low +(high-low)/2;
        int num = arr[mid]; 
          if(num==t)
          {
           index =mid;
           low=mid+1;//even if we found target, keep searching in righ part (lastIndex)
          }
          else if(num>t) high=mid-1;
          else low=mid+1;
      }
      return index;
    }
}