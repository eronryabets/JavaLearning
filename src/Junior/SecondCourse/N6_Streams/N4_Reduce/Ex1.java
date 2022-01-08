package Junior.SecondCourse.N6_Streams.N4_Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,8,2,4,3);

        //5,8,2,4,3
        //accumulator = 5	40	80	320	960
        //element =         8	2	4	3
        int result = list.stream().reduce((accumulator, element) ->
                accumulator*element).get();
        //System.out.println(result);

        //5,8,2,4,3
        //accumulator = 1   5   40  80  320 960
        //element =     5   8	2	4	3
        int result2 = list.stream().reduce(1,(accumulator, element) ->
                accumulator*element);
       // System.out.println(result2);

        List<String> stringList = List.of("Hello","Good morning","Happy to see you","ok");
        String allStrings = stringList.stream().reduce(":)",(String::concat));
        System.out.println(allStrings);

        List<String> stringList2 = List.of("Hello","Good morning","Happy to see you","ok");
        String allStrings2 = stringList.stream().reduce((a,e)->a + " " + e).get();
        System.out.println(allStrings2);



//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> op2 = list100.stream().reduce((accum, element) ->
//                accum + element);
//        if(op2.isPresent()){
//            System.out.println(op2.get());
//        }
//        else{
//            System.out.println("Not present");
//        }




    }
}
