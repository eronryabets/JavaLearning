package Junior.SecondCourse.N7_Multithreading.N2_Threading_Create;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        //2
        new Thread(()->System.out.println("Hello")).start();


    }
}
