package Junior.SecondCourse.N3_Collections.N5_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-13);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("REVERSE =============================");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        System.out.println("SHUFFLE =============================");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

    }
}
