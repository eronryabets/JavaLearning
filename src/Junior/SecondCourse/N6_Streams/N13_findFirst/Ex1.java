package Junior.SecondCourse.N6_Streams.N13_findFirst;

import Junior.SecondCourse.SHK.Student;

import java.util.List;

import static Junior.SecondCourse.SHK.Student.getStudents;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        Double firstGrade = students.stream()
                .findFirst()
                .map(Student::getAvgGrade).get();
        System.out.println(firstGrade);

        Student first = students.stream()
                .findFirst().get();
        System.out.println(first);



    }
}
