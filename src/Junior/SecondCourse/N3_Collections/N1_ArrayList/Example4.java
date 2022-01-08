package Junior.SecondCourse.N3_Collections.N1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder [] myArray = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(myArray);
        System.out.println(list);

        myArray[0].append("!!!");
        myArray[1] = new StringBuilder("F");
        System.out.println(list);
    }
}
