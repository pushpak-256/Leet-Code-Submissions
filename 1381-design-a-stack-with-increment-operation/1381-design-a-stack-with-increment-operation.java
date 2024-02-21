class CustomStack {

    private int maxSize;
    private int head = 0; 
    LinkedList<Integer> stack = new LinkedList<>();
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(head<maxSize){
            stack.offerLast(x);
            head++;
        }
    }
    
    public int pop() {
      int res = -1;
        if(!stack.isEmpty()){
          res = stack.removeLast();
          head--;
        }
      return res;
    }
    
    public void increment(int k, int val) {
        int i = 0; 
        for( ; i<k && i<stack.size();i++){
            stack.set(i,stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */