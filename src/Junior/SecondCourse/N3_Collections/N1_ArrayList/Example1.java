package Junior.SecondCourse.N3_Collections.N1_ArrayList;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zak");
        arrayList1.add("Iva");
        arrayList1.add("Mara");
        arrayList1.add(3,"Kir");

        addToArrayByIndex(arrayList1,"Petro",5);
        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(10);
        arrayList2.add(15);

        addToArrayByIndex(arrayList2,20,2);
        System.out.println(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);




    }

    public static <T> void addToArrayByIndex(ArrayList<T> list, T value, int id){
        if(list.size() > id){
            list.add(id,value);
            System.out.println("Значение успешно добавлено");
        }
        else {
            System.out.println("Нельзя добавить, в массиве меньше елементов, чем необходимо");
        }
    }
}
