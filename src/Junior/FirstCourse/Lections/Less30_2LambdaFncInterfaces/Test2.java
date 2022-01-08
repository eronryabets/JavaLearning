package Junior.FirstCourse.Lections.Less30_2LambdaFncInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List <String> stringList = Arrays.asList("a1","b2","c3");
        //stringList.forEach(System.out::println);
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(4);
        myList.add(3);
        myList.add(6);
        myList.add(7);
        myList.add(5);
        //myList.sort(x -> x=0);
        //myList.forEach(System.out::println);
        myList.removeIf(x-> x%2==0);
        myList.sort(Integer::compareTo); //(x,y)-> x.compareTo(y)
        //(x,y)-> -x.compareTo(y) Сортировка в обратном П.
        myList.forEach(System.out::println);
    }
}
