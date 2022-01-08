package Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces;

import java.util.ArrayList;

import static Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces.StudentInfo.printStudent;
import static Junior.FirstCourse.Lections.Less30Lambda.StudentWithInterfaces.StudentInfo.testStudents;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        Student3 st1 = new Student3("Alex",'m',22,5,7.8);
        printStudent(st1);
        Student3 st2 = new Student3("Nikolay",'m',28,2,6.4);
        Student3 st3 = new Student3("Elena",'f',19,1,8.9);
        Student3 st4 = new Student3("Petr",'m',35,4,7);
        Student3 st5 = new Student3("Mariya",'f',23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderGrade fsua = new FindStudentsUnderGrade();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();

        testStudents(list,fsog);
        System.out.println("--------------------------------------------------");
        testStudents(list,fsug);
        System.out.println("--------------------------------------------------");
        testStudents(list,fsoa);
        System.out.println("--------------------------------------------------");
        testStudents(list,fsua);
        System.out.println("--------------------------------------------------");
        testStudents(list,fsbs);
        System.out.println("--------------------------------------------------");
        testStudents(list,fsmc);
        System.out.println("--------------------------------------------------");
    }
}
