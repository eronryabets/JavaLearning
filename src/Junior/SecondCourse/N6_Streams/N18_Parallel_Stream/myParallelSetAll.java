package Junior.SecondCourse.N6_Streams.N18_Parallel_Stream;

import java.util.Arrays;

//Отсортируем массив чисел в параллельном режиме:
//Метод Arrays.parallelSort() в качестве параметра принимает массив и сортирует его по возрастанию:
public class myParallelSetAll {
    public static void main(String[] args) {
        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for(int i: nums)
            System.out.println(i);
    }
}
