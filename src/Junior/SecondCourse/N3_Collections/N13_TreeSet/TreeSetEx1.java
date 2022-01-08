package Junior.SecondCourse.N3_Collections.N13_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<>();
        mySet.add(5);
        mySet.add(8);
        mySet.add(2);
        mySet.add(1);
        mySet.add(10);
        System.out.println(mySet);
    }
}
