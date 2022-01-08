package Junior.SecondCourse.N3_Collections.N4_Listerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyRepeat {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("1");
        StringBuilder sb2 = new StringBuilder("2");
        StringBuilder sb3 = new StringBuilder("3");
        StringBuilder sb4 = new StringBuilder("4");
        StringBuilder sb5 = new StringBuilder("5");
        myArList.add(sb1);
        myArList.add(sb2);
        myArList.add(sb3);
        myArList.add(sb4);
        myArList.add(sb5);


        ListIterator<StringBuilder> myListIterator = myArList.listIterator();

        while(myListIterator.hasNext()){
            System.out.println(myListIterator.next());
        }

        myListIterator = myArList.listIterator(0);
        while(myListIterator.hasNext()){
            myListIterator.next().append("!!!");
        }

        System.out.println("REVERSE ========================================= ");
        ListIterator<StringBuilder> myListIteratorReverse = myArList.listIterator(myArList.size());

        while(myListIteratorReverse.hasPrevious()){
            System.out.println(myListIteratorReverse.previous());
        }

    }
}
