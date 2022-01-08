package Junior.SecondCourse.N2_Generics.N6_Wildcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //List<?> list= new ArrayList<String>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showList(list1);

        List<String>list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Ok");
        list2.add("Good");
        showList(list2);

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(3.14);
        list4.add(3.15);
        list4.add(3.16);
        System.out.println(sum(list4));

        //bounded wildcards
 //       List<? extends Number> list30 = new ArrayList<Integer>();
 //       List<? super Number> list31 = new ArrayList<Object>();

    }
    static void showList(List<?> list){
        System.out.println("Элементы листа : " + list);
    }
    //bounded wildcards
    public static double sum(ArrayList<? extends Number> list){
        double sum = 0;
        for(Number n : list ){
            sum += n.doubleValue();
        }
        return sum;
    }


}
