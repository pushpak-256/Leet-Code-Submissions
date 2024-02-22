class FooBar {
    private int n;
    private boolean foo1 = true;
    private boolean bar1  = false;
    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!foo1 && bar1){
              wait();
            }
            
           foo1 = !foo1;
           bar1 = !bar1;
           printFoo.run();
            
           notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        
        for (int i = 0; i < n; i++) {
            while(foo1 && !bar1){
              wait();
            }
            
           foo1 = !foo1;
           bar1 = !bar1;
           printBar.run();
            
           notifyAll();
        }
        
        
    }
}