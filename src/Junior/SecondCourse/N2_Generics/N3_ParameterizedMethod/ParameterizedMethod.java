package Junior.SecondCourse.N2_Generics.N3_ParameterizedMethod;

import java.util.ArrayList;

import static Junior.SecondCourse.N2_Generics.N3_ParameterizedMethod.GenMethod.getSecondElement;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("First");
        stringArrayList.add("Second");
        String test1 = getSecondElement(stringArrayList);
        System.out.println(test1);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        int test2 = getSecondElement(integerArrayList);
        System.out.println(test2);

    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
