package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

public class LambdaApp2 {

    public static void main(String[] args) {

        Expression func = (n)-> n>3;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum(nums, func)); // 20
    }


    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}

interface Expression{
    boolean isEqual(int n);
}