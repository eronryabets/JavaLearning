package Junior.SecondCourse.N6_Streams.Test;

import Junior.SecondCourse.SHK.Animals.Animal;
import Junior.SecondCourse.SHK.Animals.Classification;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Сгрупировать лист в мапу, затем вывести ее на экран.
public class ExReduceMapGroup1 {
    public static void main(String[] args) {
           List<Animal> animals = getAnimals();
          Map<Classification, List<Animal>> classificationListMap = animals.stream()
                  .collect(Collectors.groupingBy(Animal::getClassification));
         //to Display
          classificationListMap.forEach((key,list)->{
              System.out.println(key);
              list.forEach(System.out::println);
          });

          //Найдем самого старого травоядного в листе
        Optional<String> oldestName = animals.stream()
                .filter(a->a.getClassification().equals(Classification.HERBIVORE))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        if(oldestName.isPresent()){
            System.out.println("Oldest name of herbivore animal is : " + oldestName.get());
            }
        else {
            System.out.println("Not found");
        }

        //положим хищников в отдельный лист
        List<Animal> predators = animals.stream()
                .filter(a->a.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());

        System.out.println("=====================================");
        //Записать в лист все возраста, затем поместить сумму возрастов с листа в одну переменную
//        animals.stream().reduce((acum,value)->acum.getAge() + value.getAge())
        List<Integer> allAge =  animals.stream().map(Animal::getAge).collect(Collectors.toList());
        allAge.forEach(System.out::println);
        int allAgeSum = allAge.stream().reduce(Integer::sum).get();
        System.out.println("sum all ages is " + allAgeSum);

        System.out.println("=====================================");
        //попробую сделать это сразу, без нового листа
        int sumAllAges = animals.stream()
                .map(Animal::getAge)
                .reduce(Integer::sum).get();
        System.out.println(sumAllAges);




    }









    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон",20, Classification.HERBIVORE),
                new Animal("Лев",10, Classification.PREDATOR),
                new Animal("Гиена",10, Classification.PREDATOR),
                new Animal("Жираф",7, Classification.HERBIVORE),
                new Animal("Гибон",35, Classification.OMNIVOROUS),
                new Animal("Лошадь",36, Classification.HERBIVORE),
                new Animal("Рысь",2, Classification.HERBIVORE),
                new Animal("Динозавр",200, Classification.PREDATOR)
        );
    }
}
