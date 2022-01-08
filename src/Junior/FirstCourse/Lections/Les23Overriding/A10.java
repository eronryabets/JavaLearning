package Junior.FirstCourse.Lections.Les23Overriding;

public class A10 {
    String s1 = "Hello";
    static double pi = 3.14;

    int sum(int...i){
        int result = 0;
        for(int a : i){
            result += a;
        }
        return result;
    }
    static void abc(){
        System.out.println("Static method");
    }
}

class B10 extends A10{
    double pi = super.pi;
    String s1 = super.s1 + ", friend!";

    int sum(int... i){
        int result = super.sum(i);
        System.out.printf("Sum = %d . \n",result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}
