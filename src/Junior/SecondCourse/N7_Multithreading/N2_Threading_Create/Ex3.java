package Junior.SecondCourse.N7_Multithreading.N2_Threading_Create;

public class Ex3 extends Thread{
        public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println("T1 : " + i);
        }
    }

    public static void main(String[] args) {
        Ex3 thread1 = new Ex3();
        thread1.start();

        for(int i = 1000; i > 0; i--){
            System.out.println("T2 : " + i);
        }


    }
}

//
//class MyThread3 implements Runnable{
//    public void run(){
//        for(int i = 0; i <= 1000; i++){
//            System.out.println("T1 : " + i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable{
//    public void run(){
//        for(int i = 1000; i > 0; i--){
//            System.out.println("T2 : " + i);
//        }
//    }
//}
