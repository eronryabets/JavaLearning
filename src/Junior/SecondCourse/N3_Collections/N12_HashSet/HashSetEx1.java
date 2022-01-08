package Junior.SecondCourse.N3_Collections.N12_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Zaur");
        mySet.add("Oleg");
        mySet.add("Marina");
        mySet.add("Igor");

        //System.out.println(mySet);
        //mySet.forEach(System.out::println);
//        for(String s : mySet){
//            System.out.println(s);
//        }
        mySet.remove("Zaur");
        System.out.println(mySet.isEmpty());
        System.out.println(mySet.contains("Mike"));

    }
}
