package Junior.SecondCourse.N3_Collections.N14_LinkedHashSet;



import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(5);
        myLinkedHashSet.add(3);
        myLinkedHashSet.add(1);
        myLinkedHashSet.add(8);
        myLinkedHashSet.add(10);
        System.out.println(myLinkedHashSet);
        myLinkedHashSet.remove(8);
        System.out.println(myLinkedHashSet.contains(10));
    }
}
