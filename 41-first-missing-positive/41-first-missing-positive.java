class Solution {
    public int firstMissingPositive(int[] nums) {
    HashSet <Integer> hs = new HashSet<>();
        
        for(int x : nums)
        { 
          if(x>0){hs.add(x);} 
        }
        int num =1;
        int loop = hs.size();
        while(loop-- >0)
        {
            if(!hs.contains(num))
            {
              return num;
            }
            else
            {
              num++;
            }
        }
        return num;
    }
}