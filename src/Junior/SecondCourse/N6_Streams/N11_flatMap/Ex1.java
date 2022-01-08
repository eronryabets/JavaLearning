package Junior.SecondCourse.N6_Streams.N11_flatMap;

import Junior.SecondCourse.SHK.Student;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nik",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mara",'f',23,3,9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty()
                .stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}

class Faculty{
    String name;
    List<Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentOnFaculty.add(st);
    }

}
