package Junior.SecondCourse.N6_Streams.N4_Reduce.MyExample;

import java.util.List;
import java.util.Optional;

public class ExReduce1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
        List<String> stringList = List.of("Hello", "How are you?", "It is a good day!");

        Optional<Integer> myInt = integerList.stream().reduce(Integer::sum);
        int sumIntList;
        if(myInt.isPresent()){
            sumIntList = myInt.get();
            System.out.println(sumIntList);
        }
        else {
            sumIntList = 0;
            System.out.println("myInt is empty");
        }

        Optional<String> myString = stringList.stream().reduce((acum, value)->(
         acum + " " + value));
        if(myString.isPresent()){
            System.out.println(myString.get());
        }else {
            System.out.println("myString is empty");
        }

    }
}
