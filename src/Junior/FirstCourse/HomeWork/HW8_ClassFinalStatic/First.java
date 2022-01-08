package Junior.FirstCourse.HomeWork.HW8_ClassFinalStatic;

public class First {

    static final double Pi= 3.14;

    public static int multiply(int a, int b, int c){
        int result = (a*b*c);
        System.out.println(result);
        return result;
    }

    public static void divisionOnlyOnDisplay (double a, double b){
        double result = (a/b);
        System.out.println(result);

    }

    public double areaOfCircle(double radius){
        double result = Pi* radius * radius;
        System.out.println("Area = " + result);
        return result;
    }

    public static double perimeterOfCircle(double radius){
        double result = 2 * Pi* radius;
        System.out.println("Perimeter = " + result);
        return result;
    }

    public void areaAndPerimeterOfCircleOnlyOnDisplay(double radius){
        double resultArea = areaOfCircle(radius);
        double resultPerimeter = perimeterOfCircle(radius);
        System.out.println("Area = " + resultArea  + "; Perimeter = " + resultPerimeter + ";" );
    }


}
