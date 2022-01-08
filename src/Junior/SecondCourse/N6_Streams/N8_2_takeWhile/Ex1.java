package Junior.SecondCourse.N6_Streams.N8_2_takeWhile;

import Junior.SecondCourse.SHK.Student;
import static Junior.SecondCourse.SHK.Student.getStudents;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        //“Стримь пока попадаются значения меньше 0 ”
        Stream<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers1.takeWhile(n -> n < 0)
                .forEach(System.out::println);

        //включает в стрим элементы < 0
        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers2.sorted(Integer::compareTo)
                .takeWhile(n -> n < 0)
                //.filter(n -> n < 0)
                .forEach(System.out::println);

        List<Student> students = getStudents();
        students.stream().forEach(System.out::println);

        System.out.println("Вывод takeWhile :");
        //стримь пока возраст студента больше 20и лет
        students.stream()
                .takeWhile(student -> student.getAge()>20)
                .forEach(System.out::println);







    }
}
