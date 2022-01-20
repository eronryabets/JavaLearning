package Junior.SecondCourse.Projects.Repeat.AllRepeat;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person("Alex",22,"Tiger",1977,340);
        Person p2 = new Person("Anna",24,"Tiger",1977,340);
        Person p3 = new Person("Alex",22,"Tiger",1977,340);
        Person p4 = new Person("Linda",34,"Tiger",1977,340);
        Person p5 = new Person("Swarm",1989,"Tiger",1977,340);
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        //personList.forEach(System.out::println);
        //повторение listIterator
        //вывод эдементов в обычном порядке
        ListIterator<Person> listIterator = personList.listIterator(0);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("------------------");
        //вывод эдементов в c конца
        listIterator = personList.listIterator(personList.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        //заменим всех возраст на 20
        System.out.println("Change name------------------");
        listIterator = personList.listIterator(0);
        while (listIterator.hasNext()){
            listIterator.next().setYearsOld(20);
        }
        personList.forEach(System.out::println);
        //удалить два последних обьекта
        System.out.println("Delete last 2 object------------------");
        listIterator = personList.listIterator(personList.size());
        for (int i=0; i < 2; i++){
            listIterator.previous();
            listIterator.remove();
        }
        personList.forEach(System.out::println);
        //Бинарный поиск, есть ли p5 (которого удалили)
        Comparator<Person> personComparator = new Person.PersonIdComparator();
        personList.sort(personComparator);
        Collections.sort(personList);
        int index = Collections.binarySearch(personList,p5);
        System.out.println(index);
        System.out.println("Names update------------------");
        //Допишем смайл к именам "_:)" - это уже через стримы
        personList.stream().peek(person -> person.setName(person.getName()+"_:)")).forEach(System.out::println);

        //сделаем мапу
        System.out.println("MAP------------------");
        Map<Integer, List<Person>> personMap = personList.stream().collect(Collectors.groupingBy(Person::getId));
//        personMap.forEach((key,list)->{
//            System.out.println(key);
//            list.forEach(System.out::println);
//        });
        for(Map.Entry<Integer,List<Person>> entry: personMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }











    }
}
