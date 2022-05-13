class Solution {
    public void duplicateZeros(int[] arr) {
    
        List <Integer> ll = new ArrayList();
	    
        int index=0;                          
        //index increment as we add elements in List
	    
        for(int i=0;i<arr.length;i++) {	
	    	
            if(arr[i]==0) 
            {
              ll.add(index++,arr[i]);      // zero from array
              ll.add(index++,0);           // add duplicate zero 
            }
	    	
            else 
            { ll.add(index++,arr[i]); } // add non zero as it is in list
	    	
            arr[i]=ll.get(i);             
        //update our Array at i , with respect to our Updated list 
	    }   
    }
}