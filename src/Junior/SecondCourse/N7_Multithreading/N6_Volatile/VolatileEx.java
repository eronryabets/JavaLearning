package Junior.SecondCourse.N7_Multithreading.N6_Volatile;

public class VolatileEx extends Thread {
   volatile boolean b = true;
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        //мейн поток спит три секунды, поэтому метод run работает три секунды
        //после чего мейн поток просыпается и меняет b = false
        System.out.println("After 3 seconds it is time to wake up!");
        //тут мы в Main потоке говорим потоку thread изменить переменную b
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}