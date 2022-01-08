package Junior.SecondCourse.N7_Multithreading.N2_Threading_Create;

public class Ex1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread3 = new MyThread1();
        //MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        //myThread2.start();
        myThread3.start();
    }

}

class MyThread1 extends Thread{
    public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println("T1 : " + i);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i = 1000; i > 0; i--){
            System.out.println("T2 : " + i);
        }
    }
}
