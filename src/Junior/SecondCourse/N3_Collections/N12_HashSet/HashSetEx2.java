package Junior.SecondCourse.N3_Collections.N12_HashSet;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet1 = new HashSet<>();
        myHashSet1.add(5);
        myHashSet1.add(2);
        myHashSet1.add(3);
        myHashSet1.add(1);
        myHashSet1.add(8);

        HashSet<Integer> myHashSet2 = new HashSet<>();
        myHashSet2.add(7);
        myHashSet2.add(3);
        myHashSet2.add(4);
        myHashSet2.add(5);
        myHashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(myHashSet1);
        union.addAll(myHashSet2);
        //union.forEach(System.out::println);

//        HashSet<Integer> intersect = new HashSet<>(myHashSet1);
//        intersect.retainAll(myHashSet2);
//        intersect.forEach(x-> System.out.println(x));

        HashSet<Integer> subtract = new HashSet<>(myHashSet1);
        subtract.removeAll(myHashSet2);
        subtract.forEach(x-> System.out.println(x));

    }
}
