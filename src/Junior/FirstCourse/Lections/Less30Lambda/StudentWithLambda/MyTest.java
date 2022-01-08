package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

public class MyTest {
    public static void main(String[] args) {

        MyOperation sum;
        sum = ((x, y) -> x+y);

        MyOperation minus;
        minus = ((x, y) -> x-y);

        int test1 = sum.calculate(5,5);
        System.out.println(test1);

        int test2 = minus.calculate(10,5);
        System.out.println(test2);

    }
}
interface MyOperation {
    int calculate(int x, int y);
}
