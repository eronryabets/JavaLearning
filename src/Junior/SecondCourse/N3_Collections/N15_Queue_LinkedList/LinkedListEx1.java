package Junior.SecondCourse.N3_Collections.N15_Queue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Zaur");
        myQueue.add("Oleg");
        myQueue.add("Ivan");
        myQueue.add("Mara");
        myQueue.add("Alex");
        myQueue.forEach(System.out::println);
        System.out.println("=====================");
       // System.out.println(myQueue.poll());
        //System.out.println(myQueue.peek());
        myQueue.remove("Ivan");
        System.out.println("=====================");
        myQueue.forEach(System.out::println);


    }
}
