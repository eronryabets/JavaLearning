package Junior.SecondCourse.N3_Collections.N4_Listerator;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        ArrayList<StringBuilder> myStates = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Germany");
        StringBuilder sb2 = new StringBuilder("France");
        StringBuilder sb3 = new StringBuilder("Italy");
        StringBuilder sb4 = new StringBuilder("Spain");
        myStates.add(sb1);
        myStates.add(sb2);
        myStates.add(sb3);
        myStates.add(sb4);


        //выведем елементы через Итератор
//        Iterator<StringBuilder> myIter = myStates.iterator();
//        while(myIter.hasNext()){
//            System.out.println(myIter.next());
//        }
//        System.out.println("-------------------------------");

        // сейчас текущий элемент - Испания
        // изменим значение этого элемента при помощи ЛистИтератора
        ListIterator<StringBuilder> myLister = myStates.listIterator();
        while (myLister.hasNext()){
            if(myLister.next().toString().equals("Spain")){
                System.out.println("Spain is found!");
                StringBuilder sb5 = new StringBuilder("UKRAINE");
                myLister.set(sb5);
            }
        }

        //myStates.forEach(x-> System.out.println(x));
        System.out.println("------------------------------- Previous");

        //System.out.println(sb4.toString().equals("Spain"));
        // пройдемся по элементам в обратном порядке
        while (myLister.hasPrevious()){
            System.out.println(myLister.previous());
        }

    }
}