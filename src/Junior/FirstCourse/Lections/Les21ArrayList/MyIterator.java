package Junior.FirstCourse.Lections.Les21ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = "A";
        String s2 = "D";
        String s3 = "C";
        String s4 = "B";
        String s5 = "D";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Collections.sort(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){ //выполняет, если есть следующий елемент.
            System.out.println(iterator.next()); //то выводим на экран следующий елемент
            iterator.remove(); //удаляем этот следующий елемент.

        }



    }
}
