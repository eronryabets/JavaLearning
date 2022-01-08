package Junior.SecondCourse.N6_Streams.N18_Parallel_Stream;

import java.util.Arrays;
/*
Метод parallelPrefix() походит для тех случаев, когда надо получить элемент массива или объект того же типа,
что и элементы массива, который обладает некоторыми признаками. Например,
в массиве чисел это может быть максимальное, минимальное значения и т.д. Например, найдем произведение чисел:
 */
public class myParallelSort {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Arrays.parallelPrefix(numbers, (x, y) -> x * y);

        for(int i: numbers)
            System.out.println(i);
    }
}
