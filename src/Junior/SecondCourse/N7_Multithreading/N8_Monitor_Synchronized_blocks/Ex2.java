package Junior.SecondCourse.N7_Multithreading.N8_Monitor_Synchronized_blocks;


public class Ex2 {
    volatile static int counter = 0;
    public static void increment () {
        synchronized (Ex2.class){
            counter++;
        }

    }



    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2{
    static int count = 0;
}
class MyRunnableImpl2 implements Runnable{
    public  void doWork() {
        synchronized (this){
            Counter.count++;
            System.out.println(Counter.count);
        }

    }
    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            doWork();
        }
    }
}