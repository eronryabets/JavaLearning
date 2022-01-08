package Junior.SecondCourse.N7_Multithreading.N3_Thread_Name_Priority;

public class Ex1 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.setName("My_Thread");
        myThread1.setPriority(Thread.MIN_PRIORITY); //1
        myThread2.setPriority(Thread.NORM_PRIORITY); //5
        myThread3.setPriority(Thread.MAX_PRIORITY); //10

        System.out.println("Name of myThread1 = " + myThread1.getName() +
                "; Priority of myThread1 = " + myThread1.getPriority());

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}