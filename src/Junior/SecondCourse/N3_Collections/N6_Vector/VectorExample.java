package Junior.SecondCourse.N3_Collections.N6_Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Oleg");
        vector.add("Kirill");
        vector.add("Roma");
        vector.add("Mark");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector.get(2));
    }
}
