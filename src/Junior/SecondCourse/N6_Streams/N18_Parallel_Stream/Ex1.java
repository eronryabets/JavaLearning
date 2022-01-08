package Junior.SecondCourse.N6_Streams.N18_Parallel_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream()
                .reduce(Double::sum).get();//16.25
        //System.out.println(sumResult);

        //делим на каждый последующий элемент
        //(!) parallelStream() нельзя использовать, так как результат будет 0.5
        double divisionResult = list.stream()
                .reduce((acum,element)->acum/element).get();
        System.out.println(divisionResult); //8

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x, y)-> x*y);
        System.out.println(result.get()); // 720

        System.out.println("-------------------------------");
        list.parallelStream()
                .sorted()
                .forEachOrdered(System.out::println);


        System.out.println("-------------------------------");
        list.parallelStream()
                .sorted()
                .unordered()
                .forEach(System.out::println);




    }
}
