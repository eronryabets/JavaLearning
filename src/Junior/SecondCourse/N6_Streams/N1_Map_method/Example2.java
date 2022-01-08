package Junior.SecondCourse.N6_Streams.N1_Map_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("Hi","By","Good morning", "Nice");
        List<Integer> listStringLength = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(listStringLength);

    }
}
