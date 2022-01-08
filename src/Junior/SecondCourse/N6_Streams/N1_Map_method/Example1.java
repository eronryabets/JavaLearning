package Junior.SecondCourse.N6_Streams.N1_Map_method;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

//        for(int i = 0; 8 < list.size(); i++){
//            list.set(i,String.valueOf(list.get(i).length()));
//        }

       //из стрима стрингов мы получили -  9 2 4
        //list.stream().map(element->element.length());

        //допустим мы хотим сосздать новый листь интов -
        // мы должны преобразовать поток в лист
        List<Integer> list2 =  list.stream().map(element->element.length())
                .collect(Collectors.toList());
        //System.out.println(list2);

        int[] array = {5,9,3,8,1};
        array = Arrays.stream(array).map(element
                -> {
            if(element % 3 == 0) {
                    element = element / 3;
            }
        return element;
        }).toArray();
        //System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set<Integer> setInt = set.stream().map(String::length)
                .collect(Collectors.toSet());
        System.out.println(setInt);





    }
}
