package Junior.SecondCourse.N3_Collections.N1_ArrayList;



import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zak");
        arrayList1.add("Iva");
        arrayList1.add("Mara");
        arrayList1.add("Iva");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        //arrayList1.clear();
        //System.out.println(arrayList1);
        arrayList1.indexOf("Iva");
        System.out.println(arrayList1.indexOf("Iva"));

        arrayList1.lastIndexOf("Iva");
        System.out.println(arrayList1.lastIndexOf("Iva"));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Zak"));






    }
}
