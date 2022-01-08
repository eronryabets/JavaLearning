package Junior.SecondCourse.N7_Multithreading.N9_Wait_Notify_methods;

public class Ex1 {
    public static void main(String[] args) {
        //синхронизация по this, а именно по market - поэтому Гет и Пут не будут одновременно работать
        Market market = new Market();
        Producer producer = new Producer(market);
        Thread thread1 = new Thread(producer);
        Consumer consumer = new Consumer(market);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();


    }
}

class Market {
    private int breadCount = 0;

    //метод взятия хлеба потребителем
    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait(1000);//если хлеба нет - жди
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        breadCount--; //если хлеб есть - берем 1
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Колличество хлеба в магазине = " + breadCount);
        notify(); // сообщили, что кол-во хлеба уменьшилось, и производитель может добавлять хлеб
    }

    //метод пополнения хлеба производителем
    public synchronized void putBread() {
        while (breadCount >= 5) { //если 1 то сразу будет забиратся
            try {
                wait(); // если хлеб 5 из 5 - жди
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++; // хлеба меньше 5и, ложим 1
        System.out.println("Производитель добавил на ветрину 1 хлеб");
        System.out.println("Колличество хлеба в магазине = " + breadCount);
        notify(); // сообщили что хлеб добавился, покупатель может брать 1
        //аналог this.notify();
    }
}

class Producer implements Runnable {
    Market market;

    Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}