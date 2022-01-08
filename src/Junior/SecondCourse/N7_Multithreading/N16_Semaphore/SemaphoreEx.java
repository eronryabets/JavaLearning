package Junior.SecondCourse.N7_Multithreading.N16_Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore (2);
        //получает доступ только 2а потока
        new Person("Alex",callBox);
        new Person("Oleg",callBox);
        new Person("Elena",callBox);
        new Person("Victor",callBox);
        new Person("Marina",callBox);
    }
}
class Person extends Thread{
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start(); // запуск потока при создании Obj
    }
    public void run(){
        try {
            System.out.println(name + " ждет ... ");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном. ");
            sleep(2000);
            System.out.println(name + " завершил(а) звонок.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
