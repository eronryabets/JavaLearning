package Junior.SecondCourse.N7_Multithreading.N10_Deadlock_Livelock_LockStarvation;

public class DeadlockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    public void run(){
        System.out.println("Thread10: Попытка захватит монитор объекта lock1");
        synchronized (DeadlockEx.lock1){
            System.out.println("Thread10: монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватит монитор объекта lock2");
            synchronized (DeadlockEx.lock2){
                System.out.println("Thread10: мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }

}

class Thread20 extends Thread{
    public void run(){
        System.out.println("Thread20: Попытка захватит монитор объекта lock2");
        synchronized (DeadlockEx.lock2){ //lock1
            System.out.println("Thread20: монитор объекта lock2 захвачен");
            System.out.println("Thread20: Попытка захватит монитор объекта lock1");
            synchronized (DeadlockEx.lock1){ //lock2
                System.out.println("Thread20: мониторы объектов lock1 и lock1 захвачены");
            }
        }
    }
}
