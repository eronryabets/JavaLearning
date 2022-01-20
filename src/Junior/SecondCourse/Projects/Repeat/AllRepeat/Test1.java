package Junior.SecondCourse.Projects.Repeat.AllRepeat;
/*
1) - comparator (  отсортировать по id). implements Cloneable
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Alex",22);
        Person p2 = new Person("Anna",24);
        Car car1 = new Car("Tiger",1977,340);
        Car car2 = new Car("Tiger",1977,340);
        Car car3 = new Car("Eagle",1987,240);
        Car car4 = new Car("Hawk",1999,440);
        p1.setCar(car1);
        p2.setCar(car2);
        Person p3 = new Person("Alex",22,car4);
        Person p4 = new Person("Linda",34,car3);
        personList.add(p2);
        personList.add(p4);
        personList.add(p1);
        personList.add(p3);
        personList.forEach(System.out::println);
        System.out.println("After sort ------------------------");
        Comparator<Person> personComparator = new Person.PersonIdComparator();
        personList.sort(personComparator);
        personList.forEach(System.out::println);
        System.out.println("======CLONE TEST======");
        Car car5 = new Car("Galaxy",2000,777);
        Person p5 = new Person("Swarm",1989,car5);
        Person p6 = p5.clone();
        Car car6 = car5.clone();
        car6.setHorsePower(888);
        p6.setCar(car6);
        System.out.println("Original : " + p5 + "\nCloned : " + p6 );

        System.out.println("Second Element ------------------------");
        showSecondElement(personList);

    }

    public static void showSecondElement (List<?> list){
        System.out.println(list.get(1));
    }

}
