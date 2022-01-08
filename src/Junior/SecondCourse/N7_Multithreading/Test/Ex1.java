package Junior.SecondCourse.N7_Multithreading.Test;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread begin");
        System.out.println("Thread name : " + Thread.currentThread().getName());
        Thread thread1 = new Thread(new myThread());
        thread1.setName("Thread n1 : ");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread1.join();
        System.out.println("Main thread finish");
    }
}

class myThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
