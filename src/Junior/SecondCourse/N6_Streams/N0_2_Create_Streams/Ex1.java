package Junior.SecondCourse.N6_Streams.N0_2_Create_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {

        //1 получение потока из arrayList
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(s->s.length()==6)
                .forEach(System.out::println);

        //2
        ArrayList<String> cities2 = new ArrayList<String>();
        Collections.addAll(cities2, "Париж", "Лондон", "Мадрид");
        // получаем поток
        Stream<String> citiesStream = cities2.stream();
        // применяем фильтрацию по длине строки
        citiesStream = citiesStream.filter(s->s.length()==6);
        // выводим отфильтрованные строки на консоль
        citiesStream.forEach(System.out::println);

        //3
        IntStream myIStream = Arrays.stream(new int[]{1,2,4,5,7});
        myIStream.forEach(System.out::println);

        LongStream myLStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        myLStream.forEach(System.out::println);

        DoubleStream myDStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345, 121});
        myDStream .forEach(System.out::println);

        //4
        //Передаем ArrayList:
        Stream<List> citiesStream1 =Stream.of(cities);
        citiesStream1.forEach(System.out::println);
        // можно передать массив:
        String[] cities3 = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream2 =Stream.of(cities3);

        IntStream intStream = IntStream.of(1,2,4,5,7);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(100,250,400,5843787,237);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(System.out::println);

    }
}
