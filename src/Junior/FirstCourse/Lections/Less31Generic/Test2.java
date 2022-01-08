package Junior.FirstCourse.Lections.Less31Generic;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(150);
        int a = getSecondElement(al1);
        System.out.println(a);
    }
    public static <T> T getSecondElement (ArrayList<T> al){
        return al.get(1);
    }
}
