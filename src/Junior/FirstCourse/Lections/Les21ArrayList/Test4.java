package Junior.FirstCourse.Lections.Les21ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        System.out.println(list1);



    }
}
