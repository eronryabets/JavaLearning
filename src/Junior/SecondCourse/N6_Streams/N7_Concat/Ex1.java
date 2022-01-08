package Junior.SecondCourse.N6_Streams.N7_Concat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);
        Stream<Integer> allStream = Stream.concat(stream1,stream2);
        allStream.forEach(System.out::println);

        People p1 = new People("Alex");
        People p2 = new People("Sasha");
        People p3 = new People("Marina");
        People p4 = new People("Xena");
        List<People> manList = List.of(p1,p2);
        List<People> womanList = List.of(p3,p4);

        Stream.concat(manList.stream(),womanList.stream())
                .forEach(System.out::println);


    }
}

class People{
    final private String name;

    People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}