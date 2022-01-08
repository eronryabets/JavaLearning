package Junior.SecondCourse.N3_Collections.N13_TreeSet;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> myTreeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Misha",1);
        Student st3 = new Student("Igor",2);
        Student st4 = new Student("Marina",3);
        Student st5 = new Student("Olya",4);

        myTreeSet.add(st1);
        myTreeSet.add(st2);
        myTreeSet.add(st3);
        myTreeSet.add(st4);
        myTreeSet.add(st5);
        //System.out.println(myTreeSet);
        myTreeSet.forEach(System.out::println);
        System.out.println("--------------------");
        Student st6 = new Student("Oleg",2);
        //System.out.println(myTreeSet.tailSet(st6));
        Student st7 = new Student("Ira",4);
        System.out.println((myTreeSet.subSet(st6,st7)));
        System.out.println(st3.equals(st6));
        System.out.println(st3.hashCode() == st6.hashCode());
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return course == student.course;
              //  && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course); //name,
    }
//        @Override
//    public int compareTo(Student o) {
//        return this.course - o.course;
//    }
}
