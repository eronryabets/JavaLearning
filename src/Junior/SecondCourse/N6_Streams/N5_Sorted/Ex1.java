package Junior.SecondCourse.N6_Streams.N5_Sorted;

import Junior.SecondCourse.SHK.Animals.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        int [] myArray = {3,12,43,56,2,4,67,23,52};
        myArray = Arrays.stream(myArray).sorted().toArray();
        Arrays.stream(myArray).forEach(System.out::println);

        List<Animal> animalList = Main.getAnimals();
        // Main.getAnimals() метод возращает заполненый лист
        animalList = animalList.stream()
                .sorted(Comparator.comparing(Animal::getClassification))
                .collect(Collectors.toList());
        animalList.forEach(System.out::println);




    }
}
