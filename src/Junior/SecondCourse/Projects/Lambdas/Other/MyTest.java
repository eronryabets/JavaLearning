package Junior.SecondCourse.Projects.Lambdas.Other;

import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3); //неизменяемй лист!
        List<Integer> list2 = Arrays.asList(1, 2, 3); //изменяемый лист!
        //list1.set(0,44);
        list1.forEach(x-> System.out.println(x));
        list2.set(0,33);
        list2.forEach(x-> System.out.println(x));

    }
}
