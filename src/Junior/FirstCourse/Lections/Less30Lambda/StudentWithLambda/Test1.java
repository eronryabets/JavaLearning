package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

public class Test1 {



    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 10;

        Calculation mySum;
        Calculation myMinus;
        Calculation myDivide;

        mySum = (x,y) -> x+y;
        myMinus = (x,y) -> x-y;
        myDivide = (x,y) -> x/y;

        double test1 = mySum.operation(5,8);
        double test2 = myMinus.operation(5,8);
        double test3 = myDivide.operation(5,8);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }
}
interface Calculation {
    double operation (double x, double y);
}
