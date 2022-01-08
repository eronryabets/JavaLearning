package Junior.SecondCourse.N6_Streams.N9_Count;

import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(stream1.count());//8
        //System.out.println(stream1.distinct().count());

    }
}
