package Junior.SecondCourse.N3_Collections.N8_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3245, "Ivan Ivanov");
        map1.put(5234, "Marina Sidorova");
        map1.put(3452, "Nik Sever");
        map1.forEach((x, s) -> System.out.println("Id: " + x + "; Person : " + s));
        System.out.println("============================");
        System.out.println(map1.keySet());


    }
}
