package Junior.SecondCourse.N5_Lambda.Test;

import Junior.SecondCourse.SHK.Animals.Animal;
import Junior.SecondCourse.SHK.Student;
import java.util.List;
import java.util.stream.Collectors;

import static Junior.SecondCourse.SHK.Student.getStudents;

public class Repeat3 {
    public static void main(String[] args) {
        List<Student> studentList = getStudents();
        //studentList.forEach(System.out::println);
        //студенты чьи балы выше 8и
        List<Student> studentGrade8 = studentList.stream()
                .filter(student -> student.getAvgGrade() > 8)
                .collect(Collectors.toList());
        //studentGrade8.forEach(System.out::println);
//        studentList.stream()
//                .filter(student -> student.getAvgGrade() > 8)
//                .forEach(System.out::println);
        //ну а теперь попробую без функциональных интерфейсов
        checkerInfo(studentList,student -> student.getAvgGrade() > 8);
        System.out.println("Next");
        checkerInfo(studentList,student -> student.getSex() == 'f');

    }

     //просто вывести на экран
    public static void checkerInfo(List <Student> list, Check checker){
        for(Student student : list){
            if(checker.check(student)){
                System.out.println(student);
            }
        }
    }



}

interface Check {
    boolean check (Student a);
}
