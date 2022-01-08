package Junior.SecondCourse.N6_Streams.N8_3_dropWhile;

import Junior.SecondCourse.SHK.Student;
import static Junior.SecondCourse.SHK.Student.getStudents;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        //“Не включай в поток элементы пока не наткнешься на элемент >= 0,
        // и затем начинай поток со всеми следующими элементами ”
        List<Integer> numbers = List.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.stream()
                .dropWhile(n -> n < 0)
                .forEach(System.out::println);

        System.out.println("=============================");

        Stream<Integer> numbers3 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers3.sorted()
                .dropWhile(n -> n < 0)
                .forEach(System.out::println);

        System.out.println("=============================");

        List<Student> students = getStudents();
        students.stream()
                //.sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);

        System.out.println("Вывод dropWhile :");
//        students.stream() //нет смысла в сортировке!
//                .sorted(Comparator.comparing(Student::getAge))
//                .dropWhile(s-> s.getAge() > 22)
//                .forEach(System.out::println);

        //Начинай стрим, когда возраст будет не соответсовать условию, тоесть  будет Age < 20
        students.stream()
                .dropWhile(student -> student.getAge() > 20)
                .forEach(System.out::println);



    }
}
