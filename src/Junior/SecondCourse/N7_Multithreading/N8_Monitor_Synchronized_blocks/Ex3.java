package Junior.SecondCourse.N7_Multithreading.N8_Monitor_Synchronized_blocks;

public class Ex3 {
    //static final Car car = new Car();
    static final Object lock = new Object();
    synchronized void mobileCall() {
        synchronized (lock){
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }
    synchronized void skypeCall() {
        synchronized (lock){
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }

    }
    synchronized void watsappCall() {
        synchronized (lock){
            System.out.println("WatsappCall call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WatsappCall call ends");
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable{
    @Override
    public void run() {
        new Ex3().mobileCall();
    }
}

class RunnableImplSkype implements Runnable{
    @Override
    public void run() {
        new Ex3().skypeCall();
    }
}

class RunnableImplWatsapp implements Runnable{
    @Override
    public void run() {
        new Ex3().watsappCall();
    }
}
class Car{

}
