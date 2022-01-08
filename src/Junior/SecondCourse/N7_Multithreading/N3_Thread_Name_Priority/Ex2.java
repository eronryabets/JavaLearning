package Junior.SecondCourse.N7_Multithreading.N3_Thread_Name_Priority;

public class Ex2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name =" +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex2());
        thread.start();
        System.out.println("Method main. Thread name =" +
                Thread.currentThread().getName());
    }


}
