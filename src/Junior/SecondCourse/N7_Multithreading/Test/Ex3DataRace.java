package Junior.SecondCourse.N7_Multithreading.Test;

import static Junior.SecondCourse.N7_Multithreading.Test.Counter.count;

public class Ex3DataRace {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Count = " + count);
        MyThread runnable = new MyThread();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Count = " + count); //9
    }
}
class Counter {
    public static int count;

}
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter();
            System.out.println("run: " + Thread.currentThread().getName() + " count = " + count);
        }
    }
    public synchronized void counter() {
        count++;
        System.out.println("counter():" + Thread.currentThread().getName() + " count = " + count);
    }
}
