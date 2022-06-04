class Foo {

   private boolean one;
   private boolean two;
  
    public Foo() {
       one =false;
       two =false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        one=true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(!one)
        {
         wait();
        }
        two=true;
        printSecond.run();
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(!two)
        {
         wait();
        }
        printThird.run();
    }
}