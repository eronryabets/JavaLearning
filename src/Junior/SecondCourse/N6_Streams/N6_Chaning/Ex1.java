package Junior.SecondCourse.N6_Streams.N6_Chaning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Junior.SecondCourse.SHK.Student;
import static Junior.SecondCourse.SHK.Student.getStudents;
public class Ex1 {
    public static void main(String[] args) {
        int [] myArray = {3,12,43,56,2,4,67,23,52};

        int result = Arrays.stream(myArray).filter(e->e%2==1)
                .map(e->{
                    if(e%3==0)
                        e=e/3;
                        return e;})
                .reduce(Integer::sum).getAsInt();
        //System.out.println(result);

        //Имена сделать заглавными буквами, отфильтровать по полу,
        // выберем девушек, отсортируем по возрасту
        List<Student> studentList = getStudents();
        List<Student> sortedList = studentList.stream()
                .filter(student -> student.getSex() == 'f')
                .sorted(Comparator.comparing(Student::getAge))
                .map(student ->
                {student.setName(student.getName().toUpperCase()); return student;})
                .collect(Collectors.toList());

        //sortedList.forEach(System.out::println);

        //аналогично - но просто вывод на экран
        studentList.stream()
                .filter(student -> student.getSex() == 'f')
                .sorted(Comparator.comparing(Student::getAge))
                .map(student ->
                {student.setName(student.getName().toUpperCase()); return student;})
                .forEach(System.out::println);




    }
}


/*
 //Имена сделать заглавными буквами, отфильтровать по полу,выберем девушек, отсортируем по возрасту
 это если вернуть чисто именна :
List<Student> studentList = getStudents();
        List<String> sortedList = studentList.stream()
                .filter(student -> student.getSex() == 'f')
                .sorted(Comparator.comparing(Student::getAge))
                .map(student -> student.getName().toUpperCase())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
 */