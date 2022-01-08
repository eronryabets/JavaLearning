package Junior.SecondCourse.N6_Streams.Test;

import Junior.SecondCourse.SHK.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Junior.SecondCourse.SHK.Student.getStudents;

public class ExRepeat2 {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        students.forEach(System.out::println);

        Double sumAvgGrade = students.stream()
                .map(Student::getAvgGrade)
                .reduce(Double::sum)
                .get();
        System.out.println("Сумма всех средних балов студентов: " + sumAvgGrade);

        int minAge = students.stream()
                .min(Comparator.comparing(Student::getAge))
                .map(Student::getAge)
                .get();
        System.out.println("Минимальный возраст студента: " + minAge);

        //Заменим имена мужчин на Капс
        List<Student> manList = students.stream()
                .peek(student -> student.setName(student.getName().toUpperCase()))
                .collect(Collectors.toList());

        //получим имя самого старого студента из мужчин
        String oldestName = students.stream()
                .filter(s->s.getSex()=='m')
                .max(Comparator.comparing(Student::getAge))
                .map(Student::getName)
                .get();
        System.out.println("Самый большой по возрасту студент: " + oldestName);

        //добавим в мапу только студентов мужчин, ключ - это курс
        Map<Integer,List<Student>> manStudents = students.stream()
                .filter(student -> student.getSex()=='m')
                .collect(Collectors.groupingBy(Student::getCourse));

        manStudents.forEach((key,element)->{
            System.out.println(key);
            element.forEach(System.out::println);
        });


    }
}
