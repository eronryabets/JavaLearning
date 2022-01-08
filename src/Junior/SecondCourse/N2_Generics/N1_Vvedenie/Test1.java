package Junior.SecondCourse.N2_Generics.N1_Vvedenie;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Hello");
        list.add("Bye");
        list.add("Ok");
        list.add("On");
        //list.forEach(System.out::println);
        //list.add(new Car());
        for(Object o: list){
            System.out.println(o + " length " + ((String)o).length());
        }





    }
}

class Car{}