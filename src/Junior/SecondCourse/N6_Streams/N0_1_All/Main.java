package Junior.SecondCourse.N6_Streams.N0_1_All;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        // Старый подход (список должен содержать всех хищников)
       List<Animal> predatorsOld = new ArrayList<>();
       for(Animal animal : animals){
           if(animal.getClassification().equals(Classification.PREDATOR)){
               predatorsOld.add(animal);
           }
       }
       //predatorsOld.forEach(System.out::println);

        // Новый подход(Декларативный)

        // Filter
        List<Animal> predators = animals.stream().filter(animal -> animal.getClassification()
                .equals(Classification.PREDATOR))
                .collect(Collectors.toList());
       //predators.forEach(System.out::println);

        // Sort
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge)
                        .thenComparing(Animal::getClassification)
                        .reversed())
        .collect(Collectors.toList());
        //sorted.forEach(System.out::println);

        // All match
        boolean allMatch = animals.stream().allMatch(a->a.getAge()>10);
        System.out.println(allMatch);

        // Any match
        boolean anyMatch = animals.stream().anyMatch(a->a.getAge()>10);
        System.out.println(anyMatch);

        // None match
        boolean noneMatch = animals.stream().noneMatch(a->a.getAge()>10);
        System.out.println(noneMatch);

        boolean noneMatchName = animals.stream().noneMatch(a->a.getName().equals("Медведь"));
        System.out.println(noneMatchName);

        // Max
        Optional<Animal> max = animals.stream()
                .max(Comparator.comparing(Animal::getAge));
        System.out.println(max);

        // Min
        Optional<Animal> min = animals.stream()
                .min(Comparator.comparing(Animal::getAge));
        System.out.println(min);

        // Group
        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));

//        classificationListMap.forEach((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//        });
        //Чейнинг - обьеденим методы, и найдем имя самого старого хищного животного
        Optional<String> oldestPredatorName =animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);

        oldestPredatorName.ifPresent(System.out::println);

    }

    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон",20,Classification.HERBIVORE),
                new Animal("Лев",10,Classification.PREDATOR),
                new Animal("Гиена",10,Classification.PREDATOR),
                new Animal("Жираф",7,Classification.HERBIVORE),
                new Animal("Гибон",35,Classification.OMNIVOROUS),
                new Animal("Лошадь",36,Classification.HERBIVORE),
                new Animal("Рысь",2,Classification.HERBIVORE),
                new Animal("Динозавр",200,Classification.PREDATOR)
        );
    }
}
