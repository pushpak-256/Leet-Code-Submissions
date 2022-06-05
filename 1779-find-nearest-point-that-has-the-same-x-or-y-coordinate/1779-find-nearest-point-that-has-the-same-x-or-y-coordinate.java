class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
      int min = Integer.MAX_VALUE;
      int res = -1;
      for(int i =0;i<points.length;i++)
      {
          int x1=points[i][0];
          int y1=points[i][1];
        
          if( x==x1 || y==y1 )
          {
            int distance = Math.abs(y-y1)+Math.abs(x-x1);
            if(distance<min)
            {
              min=distance;
              res=i;
            }
          }
        
        }
      
      return res;
    }
}