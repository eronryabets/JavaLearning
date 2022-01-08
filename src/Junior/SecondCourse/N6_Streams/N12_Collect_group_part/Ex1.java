package Junior.SecondCourse.N6_Streams.N12_Collect_group_part;

import Junior.SecondCourse.SHK.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nik", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mara", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        //изменим нашим сдутентам имена на заглавные буквы и сортирнем по курсам
        List<Student> studentsSort = students.stream()
                .peek(s -> s.setName(s.getName().toUpperCase()))
                .sorted(Comparator.comparing(Student::getCourse))
                .collect(Collectors.toList());
        //studentsSort.forEach(System.out::println);

        //Теперь на примере мап, ключем будет курс
        Map<Integer,List<Student>> integerListMap = students.stream()
                .peek(s -> s.setName(s.getName().toUpperCase()))
                .collect(Collectors.groupingBy(Student::getCourse));
        integerListMap.forEach((key,list)->{
            System.out.println("Course "+key);
            list.forEach(System.out::println);
        });
        //альтернативный метод вывода на экарн
        for(Map.Entry<Integer,List<Student>> entry: integerListMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        //Сделаем мапу с хорошистами и неудами
        Map<Boolean,List<Student>> gradeMap = students.stream()
                .collect(Collectors.partitioningBy(s->s.getAvgGrade()>7));
        gradeMap.forEach((key,list)->{
            System.out.println(key);
            list.forEach(System.out::println);
        });






    }
}
