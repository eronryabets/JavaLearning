package Junior.SecondCourse.N7_Multithreading.N4_Sleep_Join_Thread_states;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); //1 sec
        }
        System.out.println("End");
    }
}
