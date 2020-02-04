class ThreadSleepDemo extends Thread{
    public static void main(String[] args) {
        ThreadSleepDemo thread = new ThreadSleepDemo();
        thread.start();
    }
 
 
   // @Override
    public void run(){
       try{
        int counter = 0;
            System.out.println(Thread.currentThread().getName() + " about to go for a sleep...");
            while(true)
            {
            counter++;
            Thread.sleep(1000);
            System.out.print("\b"+"\b"+"\b"+"\b"+"\b"+"\b"+"\b"+counter);
       }
   }
    catch(InterruptedException ie){
    System.out.println("Someone just interrupted me :(");
    }
    }
 }
