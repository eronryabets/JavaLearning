package Junior.SecondCourse.N6_Streams.Test;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        int count=0;
//        for(int i:numbers){
//
//            if(i > 0) count++;
//        }
//        System.out.println(count);
        //long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();

        //Добавили в новый массив все положительные числа
        int[] numbers2 = IntStream.of(numbers).filter(w -> w > 0).toArray();

        System.out.println(numbers2);
        for(Integer i : numbers2){
            System.out.println(i);
        }
        //подсчитали сколько положительных чисел
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).
                filter(w -> w > 0).count();









    }
}
