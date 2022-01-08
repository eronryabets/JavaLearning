package Junior.SecondCourse.N5_Lambda.Test;

public class Repeat2 {
    public static void main(String[] args) {
        Calculate <Integer> sum = (x, y) -> x + y;

        int result =  sum.calc(10,20);
        System.out.println(result);

        CheckBoolean sravnenie = ((x, y) -> x > y);
        boolean result2 = sravnenie.result(8,7);
        System.out.println(result2);

    }
}

interface  Calculate <T> {
     T calc( T x,  T y);
}

interface  CheckBoolean{
    boolean result(int x, int y);
}


