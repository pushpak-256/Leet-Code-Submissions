class Solution {
    public int chalkReplacer(int[] chalk, int k) {
      
	      int l = chalk.length;
        int sum = 0;
      
	      for(int i=0;i<l;i++)
	      {
	       sum+=chalk[i];
         k-=chalk[i];
          if(k<0)return i;
	      }
      
	      /*
	      sum gives us how much chalks needed for a complete loop 
	      sum%k will tell how many chalks will remain
	      */
      
	      int mod=k%(int)sum;
	      
	      for(int i=0;i<chalk.length;i++)
	      {
	        if(chalk[i]<=mod)
	        {
	          mod-=chalk[i];
	        }
	        else return i;
	      }
	      return -1;
	    }
  
}