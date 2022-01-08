package Junior.SecondCourse.N7_Multithreading.N11_Lock_and_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee emp1 = new Employee("Viktor",lock);
        Employee emp2 = new Employee("Vika",lock);
        Employee emp3 = new Employee("Oleg",lock);
        Thread.sleep(5000);
        Employee emp4 = new Employee("Dima",lock);
        Employee emp5 = new Employee("Marina",lock);
    }
}
class Employee extends Thread {
        String name;
        private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    @Override
    public void run(){
        if(lock.tryLock()){
            try {
//            System.out.println(name + " ждет...");
//            lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил свои дела");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " не хочет ждать в очереди");
        }

    }
}

/*
public void run(){
        try {
            System.out.println(name + " ждет...");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил свои дела");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
 */