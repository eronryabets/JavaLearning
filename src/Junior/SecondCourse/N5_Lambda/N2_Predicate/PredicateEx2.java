package Junior.SecondCourse.N5_Lambda.N2_Predicate;

import java.util.ArrayList;

public class PredicateEx2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno lambdas");

        al.removeIf(s -> s.length() < 5);
        al.forEach(System.out::println);
    }
}
