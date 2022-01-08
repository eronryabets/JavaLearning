package Junior.SecondCourse.N7_Multithreading.N6_Volatile;

/*
Изначально не правильно создавать обьект класса Ex2
 */

public class Ex2 implements Runnable{
    boolean b = true;
    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        Ex2 runnable = new Ex2();
        Thread thread1 = new Thread(runnable);
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up! | "  + Thread.currentThread().getName());
        runnable.b = false;
        thread1.join();
        System.out.println("End of program");
    }
}


/*
public class Ex2 implements Runnable{
    boolean b = true;
    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
            //System.out.println(Thread.currentThread().getName() + " and B = " + b);
        }
        System.out.println("Loop is finished, counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Ex2());
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up! | "  + Thread.currentThread().getName());
        Ex2 ex = new Ex2();
        System.out.println(ex.b);
        ex.b = false;
        System.out.println(ex.b);
        thread.join();
        System.out.println("End of program");
    }
}
==========================
public class Ex2 implements Runnable{
     volatile static boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (counter == 8){
                b = false;
            }
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Ex2());
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        //Ex2 ex2 = new Ex2();
        //ex2.b = false; //dont work :(
        //мы меняем переменну вне потока, и он не видит изменения (наверное)
        //и как нам указать тому потоку что мы изменили переменную???
        b = false;
        //как вариант - указать b как статическую переменную для всего класса.
        //но тогда можно и без volatile обойтись
        //VOLATILE - только поток где она обьявлена - может ее изменить!
        //Поток Main ее только читает, и изменение не происходит.
        //В  ex обьекте... он ее не сможет поменять, ведь он в потоке мейн работает!
        thread.join();
        System.out.println("End of program");
    }
}

 */