package Junior.SecondCourse.N7_Multithreading.N17_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    public static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown(); //уменьшим счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch);
    }
    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market ");
        countDownLatch.countDown(); //уменьшим счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch);
    }
    public static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown(); //уменьшим счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch);
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Alex",countDownLatch);
        new Friend("Oleg",countDownLatch);
        new Friend("Elena",countDownLatch);
        new Friend("Viktor",countDownLatch);
        new Friend("Marina",countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start(); //запускаем поток при создании
    }
    @Override
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " приступил(а) к закупкам.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
