package Junior.SecondCourse.N6_Streams.N0_1_All.MyExample;
//Filter/ Sort /All match/ Any match/ None match/ Max/ Min/ Group/ Чейнинг

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> allPerson = getPerson();
        //Filtered by Alien
        List<Person> aliens = allPerson.stream()
                .filter(p->p.getClassification()
                .equals(Classification.ALIEN))
                .collect(Collectors.toList());
        //aliens.forEach(System.out::println);

        //Sorted by classification
        List<Person> sortedList = allPerson.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getClassification))
                .collect(Collectors.toList());
        //sortedList.forEach(System.out::println);

        //All match maxSpeed > 60
        boolean allMatch = allPerson.stream().allMatch(p->p.getCar().getMaxSpeed() > 60);
        //System.out.println(allMatch);

        //Any match Age < 20;
        boolean anyMatch = allPerson.stream().anyMatch(p->p.getAge() < 20);
        //System.out.println(anyMatch);

        //найти тех кому по 20
        List<Person> list20yearsOld = allPerson.stream().filter(p -> p.getAge() == 22).collect(Collectors.toList());
        //list20yearsOld.forEach(System.out::println);

        //None match Age > 999
        boolean noneMatch = allPerson.stream().noneMatch(p->p.getAge() > 999);
        //System.out.println(noneMatch);

        //Max age
        Optional<Person> maxAge = allPerson.stream().max(Comparator.comparing(Person::getAge));
        //System.out.println(maxAge);

        //Min age
        Optional<Person> minAge = allPerson.stream().min(Comparator.comparing(Person::getAge));
        //System.out.println(minAge);

        //Group
        Map<Classification,List<Person>> groupMap = allPerson.stream()
                .collect(Collectors.groupingBy(Person::getClassification));

        //вывод мапы на экран. Передаем ключ, лист. Выводим ключ, и форичем выводим лист.
//        groupMap.forEach((classification, peopleList) ->{
//            System.out.println(classification);
//            peopleList.forEach(System.out::println);
//        } );

        //v1.2
        //найти тех кому по 20, и из них найти только одного с макс рейтом
        Optional<Person> years20oldMAxRate = allPerson.stream()
                .filter(p -> p.getAge() == 22)
                .max(Comparator.comparing(Person::getAge));
        //System.out.println(years20oldMAxRate);
        List<Person> newTest = new ArrayList<>();
        newTest.add(years20oldMAxRate.get());

        //чейнинг - найдем имя самого старого вампира
        Optional<String> vampireOldestName = allPerson.stream()
                .filter(p->p.getClassification().equals(Classification.VAMPIRE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        vampireOldestName.ifPresent(System.out::println);



    }






















    private static List<Person> getPerson(){
        return List.of(
        new Person("Petr",22,7.8,"Space Runner",78,Classification.HUMAN),
                new Person("DraLong",167,8.8,"Krilig",69,Classification.ALIEN),
                new Person("Vlad",155,8.2,"Blood Moon",81,Classification.VAMPIRE),
                new Person("Ghost",450,4.8,"Cemetery of Darkness ",82,Classification.SPIRIT),
                new Person("Dima",44,6.4,"Green Power",65,Classification.HUMAN),
                new Person("Zina",18,6.9,"Blu God",72,Classification.HUMAN),
                new Person("KzuLog",3,7.8,"Tralaxanpok",78,Classification.ALIEN),
                new Person("Dracula",340,8.9,"Rock Castle",84,Classification.VAMPIRE),
                new Person("Alex",34,5.6,"Speedy",68,Classification.HUMAN),
                new Person("Elvis",22,6.8,"Spell Singer",74,Classification.SPIRIT),
                new Person("Lenin",55,8.8,"Read Star Galaxy",85,Classification.SPIRIT)
        );
    }
}
