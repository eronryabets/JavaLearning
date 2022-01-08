package Junior.SecondCourse.N6_Streams.N3_forEach;

import Junior.SecondCourse.SHK.Student;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(e -> {
//            e*=2;
//            System.out.println(e);
//        });
        //Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::nyMethod);
        //.forEach(e->Utils.nyMethod(e);
    }
}
class Utils {
    public static void nyMethod(int a){
        a=a+5;
        System.out.println("Element = " + a);
    }
}
