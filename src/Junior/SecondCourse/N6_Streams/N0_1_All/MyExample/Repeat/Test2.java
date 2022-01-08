package Junior.SecondCourse.N6_Streams.N0_1_All.MyExample.Repeat;

import Junior.SecondCourse.SHK.Animals.Classification;
import Junior.SecondCourse.SHK.Student;
import Junior.SecondCourse.SHK.Animals.Animal;
import static Junior.SecondCourse.SHK.Animals.Animal.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Junior.SecondCourse.SHK.Student.getStudents;
public class Test2 {
    public static void main(String[] args) {
        List<Student> stList = getStudents();
        //stList.forEach(System.out::println);

        //просто вывести на экран, имена девушек капсом, сортировка по возрасту
        stList.stream()
                .filter(student -> student.getSex() == 'f')
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student; })
                .sorted(Comparator.comparing(Student::getSex))
                .forEach(System.out::println);

        System.out.println("================================");
        //Group
        List<Animal> anList = getAnimals();

        Map<Classification, List<Animal>> classificationListMap = anList.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        classificationListMap.forEach((key,list)->{
            System.out.println(key);
            list.forEach(System.out::println);
        });


    }
}
