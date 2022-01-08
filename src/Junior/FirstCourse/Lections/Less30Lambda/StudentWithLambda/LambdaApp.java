package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

public class LambdaApp {

    public static void main(String[] args) {

        //Operationable plus = (x,y)->x+y;//Integer::sum
        Operationable minus = Double::sum;
        //Имя_класса::имя_статического_метода

        double result = minus.calculate(30, 20);
        System.out.println(result); //
    }
}
interface Operationable{
    double calculate(double x, double y);
}

/*
    public static void main(String[] args) {

        Operationable op = new Operationable(){

            public int calculate(int x, int y){

                return x + y;
            }
        };
         int z = op.calculate(20, 10);
         System.out.println(z); // 30
    }
}
interface Operationable{
    int calculate(int x, int y);
}
 */