import java.util.Random;


    class RandomNumber extends Thread{
    public static void main(String[] args) {
        ThreadSleepDemo thread = new ThreadSleepDemo();
 
        thread.start();
    }
 
 
   // @Override
    public void run(){
       try{
        Random rand = new Random();

       while(true)
    {
      int n = rand.nextInt(10000);
      Thread.sleep(1000);
      System.out.println(n);
      n += 1;
       }
   }
    catch(InterruptedException ie){
      System.out.println("Someone just interrupted me :(");
    }
    }
 }