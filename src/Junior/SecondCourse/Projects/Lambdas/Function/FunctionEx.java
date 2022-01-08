package Junior.SecondCourse.Projects.Lambdas.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

/*
Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
 */
public class FunctionEx {
    public static void main(String[] args) {
        //задание 1
        Function<Integer,String> numberFunction = number -> {
            String s = null;
            if(number > 0){
                s = "Положительное число";
            }
            else if(number < 0){
                s = "Отрицательное число";
            }
            else{
                s = "Ноль";
            }
        return s;};
        System.out.println(numberFunction.apply(0));

        //задание 2. Сделать аналогично но с коллекцией.
        //Пусть метод сканит 1ую, и добовляет во 2ю ответ.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(-2);
        list.add(0);
        list.add(-33);
        list.add(44);
        list.add(98);
        list.add(-7);

        ArrayList<String> myString = new ArrayList<>();
        myString = (ArrayList<String>) list.stream().map(numberFunction).
                collect(Collectors.toList());
        myString.forEach(System.out::println);
        //.map(x -> numberFunction.apply(x) )

        System.out.println("============================================");
        //задание 3. Сделать аналогично, но для массивов
//        int[] arrayNumbers = { 5, 15, -2, 0, -33, 44, 98, -7 };
//        String [] arrayStrings;
//        arrayStrings = (String[]) Arrays.stream(arrayNumbers).mapToObj(x-> {
//            String s = null;
//            if (x>0){
//                s = "scort";
//            }
//            else
//            {
//                s = "port";
//            }
//                return s;
//                }).toArray();
//
//        for(String x : arrayStrings){
//            System.out.println(x);
//        }


    }
}

