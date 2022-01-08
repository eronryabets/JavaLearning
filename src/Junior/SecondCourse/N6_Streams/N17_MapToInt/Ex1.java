package Junior.SecondCourse.N6_Streams.N17_MapToInt;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import Junior.SecondCourse.SHK.Student;
import static Junior.SecondCourse.SHK.Student.getStudents;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = getStudents();

        List<Integer> courses = students.stream()
                .mapToInt(Student::getCourse)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        List<Double> avGrade = students.stream()
                .mapToDouble(Student::getCourse)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(avGrade);

        int sum = students.stream()
                .mapToInt(Student::getCourse)
                .sum();
        System.out.println(sum);

        double average = students.stream()
                .mapToInt(Student::getCourse)
                .average().getAsDouble();
        System.out.println(average);

        int min = students.stream()
                .mapToInt(Student::getCourse)
                .min().getAsInt();
        System.out.println(min);

        int max = students.stream()
                .mapToInt(Student::getCourse)
                .max().getAsInt();
        System.out.println(sum);
    }
}
