package Junior.SecondCourse.N3_Collections.N9_TreeMap;




import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> myTreeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Egor", "Letov", 1);
        Student st3 = new Student("Sergey", "Topolev", 4);
        Student st4 = new Student("Dima", "Perviy", 3);
        Student st5 = new Student("Zina", "Levaya", 2);
        Student st6 = new Student("Alina", "Topor", 4);
        Student st7 = new Student("Xena", "Warrior", 5);

        TreeMap<Student, Double> myTreeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        myTreeMap.put(5.8, st1);
        myTreeMap.put(6.4, st2);
        myTreeMap.put(7.2, st3);
        myTreeMap.put(7.5, st4);
        myTreeMap.put(7.9, st5);
        myTreeMap.put(8.2, st6);
        myTreeMap.put(9.1, st7);

//        myTreeMap.put(st1, 5.8);
//        myTreeMap.put(st7, 9.1);
//        myTreeMap.put(st2, 6.4);
//        myTreeMap.put(st4,7.5 );
//        myTreeMap.put(st3,7.2 );
//        myTreeMap.put(st6, 8.2);
//        myTreeMap.put(st5, 7.9);

        //System.out.println(myTreeMap);
        myTreeMap.forEach((d,s)-> System.out.println("Key: " + d + "; Value : " + s));
        System.out.println("========");
        //System.out.println(myTreeMap.get(5.8));
        //myTreeMap.remove(5.8);
        //System.out.println(myTreeMap.headMap(7.3));






    }

}
class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", course=" + course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getSurname(), student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCourse());
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
