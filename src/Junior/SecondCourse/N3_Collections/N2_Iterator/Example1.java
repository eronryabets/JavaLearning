package Junior.SecondCourse.N3_Collections.N2_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zak");
        arrayList1.add("Iva");
        arrayList1.add("Mara");
        arrayList1.add("Gor");

        Iterator <String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);

    }
}
