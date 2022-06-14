class ParkingSystem {

    int numsBig, numsMed, numsSmall;
    public ParkingSystem(int big, int medium, int small) {
        numsBig=big;
        numsMed=medium;
        numsSmall=small;
    }
    
    public boolean addCar(int x) {
         switch(x)
        {
          case 1 :
          {
            if(numsBig>0){
              numsBig--;
              return true;
            }
            else  return false;                
          }
          case 2:{
             if(numsMed>0){
              numsMed--;
              return true;
            }
            else  return false;   
          }
          case 3:{
             if(numsSmall>0){
              numsSmall--;
              return true;
            }
            else  return false;   
          }
        }
      return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */