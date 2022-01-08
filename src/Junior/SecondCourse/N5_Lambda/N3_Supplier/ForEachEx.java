package Junior.SecondCourse.N5_Lambda.N3_Supplier;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("private");
        list.add("kak dela?");
        list.add("normalno");
        list.add("poka");

//        for(String s : list){
//            System.out.println(s);
//        }

        list.forEach(s-> System.out.println(s));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(element->
        {System.out.println(element);
        element*=2;
            System.out.println(element);
        });

    }
}
