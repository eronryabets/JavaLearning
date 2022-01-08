package Junior.FirstCourse.Lections.Les19Arrays;

import java.util.Arrays;

public class TestArrays {

    public static void arraysOnDisplay(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int array1[] = {1, 4, 88, 44, -45, 45};
        arraysOnDisplay(array1);
        Arrays.sort(array1); //sort array
        System.out.println("After sort : ");
        arraysOnDisplay(array1);

        //только на отсартированном массиве, возращает индекс Числа что мы ищем
        System.out.println("binarySearch : ");
        int index1 = Arrays.binarySearch(array1, 1);
        System.out.println(index1);

        //Max Min
        System.out.println("MAX MIN = ");
        int array2[] = {-33, 55, 23, 666, 324};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < array2.length; i++) {
            max = Math.max(max, array2[i]);
        }
        System.out.println(max);

        for (int i = 0; i < array2.length; i++) {
            min = Math.min(min, array2[i]);
        }
        System.out.println(min);
        System.out.printf("Max = %d ; Min = %d ; \n",(int)max,(int)min);

        //OR
        int max2 = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max2){
                max2 = array2[i];
            }
        }
        System.out.println("Max = " + max2 + ";");
        int min2 = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < min2){
                min2 = array2[i];
            }
        }
        System.out.println("Min = " + min2 + ";");
    }
}

/*
for(int i : array1){
            System.out.println(i);
        }

============================================
for(int i = 0; i < array1.length; i++){
            System.out.println(i);
        }

 */