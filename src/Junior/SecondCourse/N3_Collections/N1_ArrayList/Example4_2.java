package Junior.SecondCourse.N3_Collections.N1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example4_2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zak");
        arrayList1.add("Iva");
        arrayList1.add("Mara");
        arrayList1.add("Nik");
        arrayList1.add("Liana");
        System.out.println("ArrayList = " + arrayList1);

//        List<Integer> list1 = List.of(3,8,13);
//        List<String> list2 = List.copyOf(arrayList1);
//        //Object[] array = arrayList1.toArray(); //содержит все обьекты АрЛиста
//        String[] array2 = arrayList1.toArray(new String [0]);
//        for(String s : array2){
//            System.out.println(s);
//        }

//        //включили с 1го эелемента по 4й ( не включая 4й)
//        List<String> myList = arrayList1.subList(1,4);
//        myList.add("Frida");
//        System.out.println(arrayList1);
//        System.out.println(myList);
//

//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Iva");
//        arrayList2.add("Mara");
//        arrayList2.add("Igor");
//        System.out.println(arrayList2);
//
////        arrayList1.removeAll(arrayList2);
////        System.out.println(arrayList1);
//
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);



    }
}
