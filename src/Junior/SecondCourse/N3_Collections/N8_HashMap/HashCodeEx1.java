package Junior.SecondCourse.N3_Collections.N8_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> myMap = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Egor", "Letov", 1);
        Student st3 = new Student("Sergey", "Topolev", 4);
        myMap.put(st1, 7.5);
        myMap.put(st2, 8.5);
        myMap.put(st3, 9.2);
        System.out.println(st1.hashCode());
        myMap.forEach((s, d) -> System.out.println(s + "; grade :" + d));
        st1.setCourse(5);
        System.out.println(myMap.containsKey(st1));
        System.out.println(st1.hashCode());

//        Student st4 = new Student("Egor", "Sidorov", 4);
////        boolean result = myMap.containsKey(st4);
////        System.out.println(result);
//        System.out.println(st1.hashCode());
//        System.out.println(st4.hashCode());
//        //вывод через for
//        for(Map.Entry<Student,Double> myEntry: myMap.entrySet()){
//            System.out.println(myEntry.getKey() + ":" + myEntry.getValue());
//        }
//
//        Map <Integer, String> map2 = new HashMap<>(16,0.75f);


    }
}


class Student {
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
}
