package Junior.SecondCourse.N6_Streams.Test;

import Junior.SecondCourse.SHK.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static Junior.SecondCourse.SHK.Student.getStudents;
//reduce - all aVgrade
//filtr m age > 20 ; name upperCase ( new List)
//group bu course

public class ExRepeat {
    public static void main(String[] args) {
        List<Student> students = getStudents();

        Optional<Double> result = students.stream()
                .map(Student::getAvgGrade)
                .reduce(Double::sum);
        double avGradeSum;
        if(result.isPresent()){
            avGradeSum = result.get();
            System.out.println("avGrade sum = " + avGradeSum);
        } else System.out.println("Result = 0");

        //при этом изменения будут и в students листе
        List<Student> studentsMan = students.stream()
                .filter(s->s.getSex() == 'm' && s.getAge() > 20)
                .peek(s-> s.setName(s.getName().toUpperCase()))
                .collect(Collectors.toList());
        //studentsMan.forEach(System.out::println);

        //если нам нужно просто имзенить именя Студентов Мж без создания нового листа.
        students.stream()
                .filter(s->s.getSex() == 'm' && s.getAge() > 20)
                .forEach(s-> s.setName(s.getName().toUpperCase()));
        //students.forEach(System.out::println);

        //сделаем мапу по курсам (и упорядочим их по годам)
        Map<Integer,List<Student>> studMap = students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.groupingBy(Student::getCourse));

        studMap.forEach((key,element)->{
            System.out.println("Course : " + key);
            element.forEach(System.out::println);
        });





    }
}
