package Junior.FirstCourse.HomeWork.HW6_ClassMethodsOverloading;

public class Calc {

    public static int sum(){
        System.out.println(0);
        return 0;
    }

    public static int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public static int sum(int a, int b, int c){
        System.out.println(a+b+c);
        return a+b+c;
    }

    public static int sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
        return a+b+c+d;
    }

    public static int sum(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
        return a+b+c+d+e;
    }

}
