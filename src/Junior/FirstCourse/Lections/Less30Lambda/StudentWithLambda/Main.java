package Junior.FirstCourse.Lections.Less30Lambda.StudentWithLambda;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Alex",'m',22,5,7.8);
        //printStudent(st1);
        Student st2 = new Student("Nikolay",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mariya",'f',23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);


//        StudentInfo.testStudents(list, (Student st) -> st.getAvgGrade() > 8.5);
//        System.out.println("--------------------------------------------------");
//        testStudents(list, st -> {int testZ = 5; return st.getAvgGrade() < 9;});
//        System.out.println("--------------------------------------------------");
//        testStudents(list,(Student st) -> st.getAge() > 25);
//        System.out.println("--------------------------------------------------");
//        testStudents(list,(Student st) -> st.getAge() < 27);
//        System.out.println("--------------------------------------------------");
//        testStudents(list,(Student st) -> st.getSex() == 'm');
//        System.out.println("--------------------------------------------------");
//        testStudents(list,(Student st) -> st.getAvgGrade() > 7.2 && st.getAge()
//                < 23 && st.getSex() == 'f');
//        System.out.println("--------------------------------------------------");
        for(Student s: list){
            System.out.println(s.getName());
        }
        list.removeIf(student -> student.getName().endsWith("a"));
    }
}
/*
    ====
    public class StudentInfo {

    public static void printStudent(Student student){
        System.out.printf("Имя студента : %s; Пол : %c; Возраст : %d; Курс : %d; Средний бал : %.2f. \n" ,
                student.getName(),student.getSex(),student.getAge(),student.getCourse(),student.getAvgGrade());
    }

    public static void testStudents(ArrayList <Student> aL, StudentChecks sc){
        for(Student s : aL) {
            if (sc.test(s)){
                printStudent(s);
            }
        }
    }
}

    ====

    public interface StudentChecks {

    boolean testStudent(Student s);

    ====

    public class FindStudentsUnderAge implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.getAge() < 25;
        }
    }
    ====
 */
