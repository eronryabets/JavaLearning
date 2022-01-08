package Junior.SecondCourse.N5_Lambda.Test;

import Junior.SecondCourse.SHK.Student;
import java.util.List;
import java.util.function.Predicate;

import static Junior.SecondCourse.SHK.Student.getStudents;

public class Repeat6 {
    public static void main(String[] args) {
        List <Student> studentList = getStudents();
        //
        checkerInfo(studentList, student -> student.getSex() == 'f');
        //
        checkerInfo2(studentList,student -> student.getAvgGrade() > 20);
        //
        studentList.stream().filter(student -> student.getCourse() > 2)
                .forEach(System.out::println);

    }
    public static void checkerInfo(List<Student> students, Check4 check){
        for(Student student : students){
            if(check.checker(student)){
                System.out.println(student);
            }
        }
    }
    public static void checkerInfo2(List<Student> students, Predicate <Student> predicate){
        for(Student student : students){
            if(predicate.test(student)){
                System.out.println(student);
            }
        }
    }

}

interface Check4{
    boolean checker (Student student);
}
