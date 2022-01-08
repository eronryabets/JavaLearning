package Junior.FirstCourse.Lections.Less30Lambda.StudentWithoutLambda;

import java.util.ArrayList;

import static Junior.FirstCourse.Lections.Less30Lambda.StudentWithoutLambda.StudentInfo2.*;

public class Main2 {
    public static void main(String[] args) {

        ArrayList <Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Alex",'m',22,5,7.8);
        printStudent(st1);
        Student2 st2 = new Student2("Nikolay",'m',28,2,6.4);
        Student2 st3 = new Student2("Elena",'f',19,1,8.9);
        Student2 st4 = new Student2("Petr",'m',35,4,7);
        Student2 st5 = new Student2("Mariya",'f',23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        printStudentOverGrade(list,8.5);
        System.out.println("______________________________________________________________");
        printStudentUnderGrade(list,9);
        System.out.println("______________________________________________________________");
        printStudentOverAge(list,25);
        System.out.println("______________________________________________________________");
        printStudentUnderAge(list,27);
        System.out.println("______________________________________________________________");
        printStudentBySex(list,'m');
        System.out.println("______________________________________________________________");
        printStudentsMixCondition(list,7.2,23,'f');

    }


}
