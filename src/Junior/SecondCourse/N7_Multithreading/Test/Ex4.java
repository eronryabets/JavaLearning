package Junior.SecondCourse.N7_Multithreading.Test;

public class Ex4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " start");
        MyThread4 myThread = new MyThread4();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(Thread.currentThread().getName() + " finish");

    }
}

class MyThread4 implements Runnable{
    static int count;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
                System.out.println(Thread.currentThread().getName() + " : " + count);
            }

        }
    }
    //    public synchronized void run() {
//        for(int i = 0; i < 3; i++){
//            count++;
//            System.out.println(Thread.currentThread().getName() + " : " + count);
//        }
//
//    }

}

