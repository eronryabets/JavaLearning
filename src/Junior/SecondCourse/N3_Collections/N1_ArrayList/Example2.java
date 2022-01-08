package Junior.SecondCourse.N3_Collections.N1_ArrayList;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zak");
        arrayList1.add("Iva");
        arrayList1.add("Mara");
        arrayList1.add(3,"Kir");
//        for(String s : arrayList1){
//            System.out.println(s);
//        }
//        //or
//        arrayList1.forEach(System.out::println);
//
//        System.out.println(arrayList1.get(2));
//        for(int i=0; i<arrayList1.size(); i++){
//            System.out.println(arrayList1.get(i));
//        }

        arrayList1.add(4,"Xena");
        arrayList1.set(4,"Thor");   //удалили Ксену и записали на ее место Тора
        System.out.println(arrayList1);
    }
}
