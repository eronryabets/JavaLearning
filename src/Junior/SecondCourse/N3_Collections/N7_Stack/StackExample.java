package Junior.SecondCourse.N3_Collections.N7_Stack;

public class StackExample {
    static void  abc1(){
        System.out.println("abc1 Starts");
        System.out.println("abc1 Ends");
    }

    static void abc2(){
        System.out.println("abc2 Starts");
        abc1();
        System.out.println("abc2 Ends");
    }

    static void abc3(){
        System.out.println("abc3 Starts");
        abc2();
        System.out.println("abc3 Ends");
    }

    public static void main(String[] args) {
        System.out.println("Main Starts");
        abc3();
        System.out.println("Main Ends");
    }


}
