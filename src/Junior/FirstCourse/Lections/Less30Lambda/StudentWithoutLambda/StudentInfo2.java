package Junior.FirstCourse.Lections.Less30Lambda.StudentWithoutLambda;

import java.util.ArrayList;

public class StudentInfo2 {

    public static void printStudent(Student2 student){
        System.out.printf("Имя студента : %s; Пол : %c; Возраст : %d; Курс : %d; Средний бал : %.2f. \n" ,
                student.getName(),student.getSex(),student.getAge(),student.getCourse(),student.getAvgGrade());
    }
    public static void printStudentOverGrade(ArrayList<Student2> aL, double avgGrade){
        for (Student2 s : aL) {
            if (s.getAvgGrade() > avgGrade) {
                printStudent(s);
            }
        }
    }
    public static void printStudentUnderGrade(ArrayList<Student2> aL, double avgGrade){
        for (Student2 s : aL) {
            if (s.getAvgGrade() < avgGrade) {
                printStudent(s);
            }
        }
    }
    public static void printStudentOverAge(ArrayList<Student2> aL, int age){
        for (Student2 s : aL) {
            if (s.getAge() > age) {
                printStudent(s);
            }
        }
    }
    public static void printStudentUnderAge(ArrayList<Student2> aL, int age){
        for (Student2 s : aL) {
            if (s.getAge() < age) {
                printStudent(s);
            }
        }
    }
    public static void printStudentBySex(ArrayList<Student2> aL, char sex){
        for (Student2 s : aL) {
            if (s.getSex() == sex) {
                printStudent(s);
            }
        }
    }
    public static void printStudentsMixCondition(ArrayList<Student2> aL, double avgGrade, int age, char sex){
        for (Student2 s : aL) {
            if (s.getAvgGrade() > avgGrade && s.getAge() < age && s.getSex() == sex) {
                printStudent(s);
            }
        }
    }




}
