package Junior.SecondCourse.N7_Multithreading.N23_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);
        //Producer
        new Thread (()->{
            int i = 0;
            while(true){
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer add number : " + i + " " + arrayBlockingQueue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Consumer
        new Thread (()->{
            while(true){
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer get number : " + j + " "
                            + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
