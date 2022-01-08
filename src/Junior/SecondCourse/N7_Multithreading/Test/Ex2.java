package Junior.SecondCourse.N7_Multithreading.Test;

public class Ex2 implements Runnable{
    volatile boolean b = true; //Main memory
    @Override
    public void run() {
        long counter = 0;
        while(b){
          counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter);
        }
        System.out.println("Loop is finished, counter = " + counter);
    }


    public static void main(String[] args) throws InterruptedException {
       Thread thread1 = new Thread(new Ex2());
        thread1.setName("Thread[1]");
        thread1.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        //thread1.b = false;
        thread1.join(10);
        System.out.println("End of program");


    }
}


