package Junior.FirstCourse.Lections.Les21ArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Bye");
        list.add(sb1);
        list.add(sb2);
        list.add(new StringBuilder("Good"));
        System.out.println(list.contains(sb1));

    }
}
