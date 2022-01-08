package Junior.SecondCourse.N7_Multithreading.N4_Sleep_Join_Thread_states;

public class Ex3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread1 = new Thread(new Worker());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread1.join(1500);
        System.out.println(thread1.getState());
        System.out.println("Method main is finished");
    }
}

class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Works begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Works ends");
    }
}
