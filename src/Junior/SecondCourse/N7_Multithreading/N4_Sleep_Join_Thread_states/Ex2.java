package Junior.SecondCourse.N7_Multithreading.N4_Sleep_Join_Thread_states;

public class Ex2 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<10; i++ ){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Ex2 thread2 = new Ex2();
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread1.join(); //дождись завершение потока1 и продолжи мейн поток
        thread2.join(); //дождись завершение потока2 и продолжи мейн поток
        System.out.println("Finish");
    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<10; i++ ){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);

        }
    }
}
