package Junior.SecondCourse.N6_Streams.N2_Filter;

import Junior.SecondCourse.SHK.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Ivan",'m',22,3,8.3),
        new Student("Nik",'m',28,2,6.4),
        new Student("Elena",'f',19,1,8.9),
        new Student("Petr",'m',35,4,7),
        new Student("Mara",'f',23,3,9.1)
        );
       // studentList.forEach(System.out::println);

        List<Student> femaleStudents = studentList.stream()
                .filter(s->s.getSex() == 'f' && s.getAge() > 18).collect(Collectors.toList());
        femaleStudents.forEach(System.out::println);

//        Stream<Student> myStream = Stream.of(st1, st2, st3 ,st4, st5);





    }
}
