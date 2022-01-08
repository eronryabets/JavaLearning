package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

import java.util.ArrayList;
import java.util.function.Predicate;


public class StudentInfo {

    public static void printStudent(Student student){
        System.out.printf("Имя студента : %s; Пол : %c; Возраст : %d; Курс : %d; Средний бал : %.2f. \n" ,
                student.getName(),student.getSex(),student.getAge(),student.getCourse(),student.getAvgGrade());
    }

    public static void testStudents(ArrayList <Student> aL, Predicate <Student> student){
        for(Student s : aL) {
            if (student.test(s)){
                printStudent(s);
            }
        }
    }
}

/*
c использованием своего интерфейса
public static void testStudents(ArrayList <Student> aL, StudentChecks sc){
        for(Student s : aL) {
            if (sc.test(s)){
                printStudent(s);
            }
        }
    }
 */