package Junior.SecondCourse.N7_Multithreading.N14_ThreadPool_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSingleExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i<10; i++){
            executorService.execute(new RunnableImpl2());
        }
        executorService.shutdown();
    }
}
class RunnableImpl2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
