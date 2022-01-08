package Junior.SecondCourse.N1_Interfaces_Comporable_and_Comporator.N1_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Egor");
        nameList.add("Masha");
        nameList.add("Petr");
        nameList.add("Stepan");
        nameList.add("Liza");
        nameList.add("Ananas");
        System.out.println("Перед сортировкой");
        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println("После сортировки");
        System.out.println(nameList);



    }
}
