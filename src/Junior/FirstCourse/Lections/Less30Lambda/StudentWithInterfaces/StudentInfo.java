package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

import java.util.ArrayList;


public class StudentInfo {

    public static void printStudent(Student3 student){
        System.out.printf("Имя студента : %s; Пол : %c; Возраст : %d; Курс : %d; Средний бал : %.2f. \n" ,
                student.getName(),student.getSex(),student.getAge(),student.getCourse(),student.getAvgGrade());
    }

    public static void testStudents(ArrayList <Student3> aL, StudentChecks sc){
        for(Student3 s : aL) {
            if (sc.testStudent(s)){
                printStudent(s);
            }
        }

    }


}
