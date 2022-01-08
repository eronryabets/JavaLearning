package Junior.FirstCourse.HomeWork.HW18_Arrays;
import java.util.Arrays;

import static Junior.FirstCourse.Lections.OnDisplay.OnDisplay.*;

public class Test1Arrays {

    public static int[] sortirovka(int[] array){
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int array1[] = {1, 4, 88, 44, -45, 45};
        //Arrays.sort(array1);
        arraysOnDisplay(array1);
        sortirovka(array1);
        arraysOnDisplay(array1);
    }
}
