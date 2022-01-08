package Junior.SecondCourse.N6_Streams.N0_1_All.MyExample.Repeat;

import Junior.SecondCourse.SHK.Animals.Animal;
import Junior.SecondCourse.SHK.Animals.Classification;

import static Junior.SecondCourse.SHK.Animals.Main.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//filter-sort-(reversed.thenComparing)-All match - any - none -max - min - group - reduce - chaining

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = getAnimals();
        //animalList.forEach(System.out::println);
        List<Animal> testList;

        //filter
        testList = animalList.stream().filter(a->a.getAge()>10)
                .collect(Collectors.toList());
        //testList.forEach(System.out::println);

        //sort
        testList = animalList.stream().sorted(Comparator.comparing(Animal::getClassification)
                .reversed().thenComparing(Animal::getAge))
                .collect(Collectors.toList());
        //testList.forEach(System.out::println);

        //All match
        boolean allMatch = animalList.stream().allMatch(a->a.getAge() > 1);
        //System.out.println(allMatch);

        //Any match
        boolean anyMatch = animalList.stream().anyMatch(a->a.getAge()>100);
        //System.out.println(anyMatch);

        //Max
        Optional<Animal> maxAge = animalList.stream().max(Comparator.comparing(Animal::getAge));
        //maxAge.ifPresent(System.out::println);

        Optional<String> nameString = animalList.stream().max(Comparator.comparing(Animal::getAge)).map(Animal::getName);
        String nameMaxAge = null;
        if(nameString.isPresent()){
            nameMaxAge = nameString.get();
        }
        //System.out.println(nameMaxAge);

        //Min
        Optional<Animal> minAge = animalList.stream().min(Comparator.comparing(Animal::getAge));
        //minAge.ifPresent(System.out::println);

        //Group
        Map<Classification, List <Animal>> groupAnimalMap = animalList.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        groupAnimalMap.forEach((key,value)->{
            System.out.println(key);
            value.forEach(System.out::println);
        });

        //reduce
        Optional<Integer> sumAge = animalList.stream()
                .map(Animal::getAge)
                .reduce(Integer::sum);
        int sumAges = 0;
        if(sumAge.isPresent()){
            sumAges = sumAge.get();
        }
        //System.out.println(sumAges);

        //chaining - name oldest predator
        Optional<String> oldestPredator = animalList.stream()
                .filter(a->a.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        String nameOldestPredator = null;
        if(oldestPredator.isPresent()){
            nameOldestPredator = oldestPredator.get();
            System.out.println(nameOldestPredator);
        }










    }
}
