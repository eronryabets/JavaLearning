package Junior.SecondCourse.N6_Streams.N8_1_Distinct;

import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.distinct().forEach(System.out::println);
    }
}
