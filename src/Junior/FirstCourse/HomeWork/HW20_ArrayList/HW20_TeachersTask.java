package Junior.FirstCourse.HomeWork.HW20_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HW20_TeachersTask {
    public static ArrayList<String> stringToArrayList(String ... s){
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        stringToArrayList("Hello","Good day","Ok","Hello","Ok");
    }

}
