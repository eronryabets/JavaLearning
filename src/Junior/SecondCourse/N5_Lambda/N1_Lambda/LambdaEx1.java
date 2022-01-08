package Junior.SecondCourse.N5_Lambda.N1_Lambda;

/*
1)Вывести через фор студентов с оценками выше 8и балов
2) Сделать это при помощи метода
3)Сделать это при помощи лямбда выражения
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;


public class LambdaEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nik",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mara",'f',23,3,9.1);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        //studentsList.forEach(s-> System.out.println(s));

//        System.out.println("Список студентов с оценками выше 8 балов:");
//        for (Student s : studentsList){
//            if (s.getAvgGrade() > 8){
//                System.out.println(s);
//            }
//        }
       // filtrationAvgGrade(studentsList,7);
        //=======INTERFACES==========
        System.out.println("INTERFACE");
        filtrationInterfaceStud(studentsList, new CheckOverGrade());
        System.out.println("INTERFACE");
        //with anon class
        filtrationInterfaceStud(studentsList, new StudentChecks() {
                    @Override
                    public boolean Check(Student s) {
                        return s.getAge()<30;
                    }
                });

        filtrationInterfaceStud(studentsList, (Student s) ->
        {return s.getAge()<30;});

        //=================================================================
        //My Examples

        filtrationStudents(studentsList, student -> student.getAvgGrade() > 8);
        System.out.println("=======================");
        filtrationStudents(studentsList,student -> student.getAge()<20);
        System.out.println("=======================");
        filtrationStudents(studentsList,student -> student.getAge()>20
                && student.getAvgGrade()>8);

        Operationable operation;
        operation = (x,y)->x+y;//Integer::sum

        Operationable sum = (x,y)-> x + y;
        Operationable minus = (x,y)-> x - y;
        Operationable umnojenie = (x,y)-> x * y;

        System.out.println(sum.calculate(20, 10)); //30
        System.out.println(minus.calculate(20, 10)); //10
        System.out.println(umnojenie.calculate(20, 10)); //200

        int result = operation.calculate(10, 20);
        System.out.println(result); //30
        //=================================================================
        //Teacher's examples :
        filtrationInterfaceStud(studentsList, (Student s) -> {return s.getAge()<30;});
        filtrationInterfaceStud(studentsList, (Student s) -> {return s.getAvgGrade() > 7;});
        filtrationInterfaceStud(studentsList, (Student s) -> {return s.getAge()<30 && s.getAvgGrade() > 7 ;});

        filtrationInterfaceStud(studentsList, s -> s.getAge()<30);

        StudentChecks sc = p -> p.getAvgGrade() > 8;
        filtrationInterfaceStud(studentsList,sc);



    }

    public static void filtrationAvgGrade(ArrayList<Student> students, int value){
        System.out.printf("Список студентов с оценками выше %d балов: \n", value);
        for (Student s : students){
            if (s.getAvgGrade() > value){
                System.out.println(s);
            }
        }
    }

    public static void filtrationStudents(ArrayList<Student> list,
                                          Predicate<Student> predicate){
        int count = 0;
        for(Student student : list){
            if(predicate.test(student)){
                System.out.println(student);
                count ++;
            }
        }
        System.out.println("Для данного списка совпало студентов : " + count);
    }

    public static void filtrationInterfaceStud(ArrayList<Student> list, StudentChecks sc){
        for(Student s : list){
            if(sc.Check(s)){
                System.out.println(s);
            }
        }
    }


}

interface StudentChecks {
    boolean Check(Student s);
}

class CheckOverGrade implements StudentChecks{

    @Override
    public boolean Check(Student s) {
        return s.getAvgGrade()>8;
    }
}

//class CheckTest implements StudentChecks{
//
//    @Override
//    public boolean Check(Student s) {
//        return s.getAvgGrade()<8;
//    }
//}

interface Operationable{
    int calculate(int x, int y);
}




class Student implements Comparable<Student> {
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                getSex() == student.getSex() &&
                getCourse() == student.getCourse() &&
                Double.compare(student.getAvgGrade(), getAvgGrade()) == 0 &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSex(), getCourse(), getAvgGrade());
    }


    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
