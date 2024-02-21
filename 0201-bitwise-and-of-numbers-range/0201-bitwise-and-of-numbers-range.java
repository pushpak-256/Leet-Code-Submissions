class Solution {
    public int rangeBitwiseAnd(int left, int right) {
     int shift = 0;
        
     while(left!=right){
           
           left>>=1; // right shift nums until they are equal 
           right>>=1;
         
           shift+=1; // increment counter how many shifts we have done
        }
        
     return left<<shift; // left shift left<<shift
    }   
}