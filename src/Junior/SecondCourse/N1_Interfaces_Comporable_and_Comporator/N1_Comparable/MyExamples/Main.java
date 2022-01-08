package Junior.SecondCourse.N1_Interfaces_Comporable_and_Comporator.N1_Comparable.MyExamples;
/*
Создать класс Person, имя, пол, возраст
Добавить в TreeSet , и попробовать сортировки разные через компоратор
Затестиь варианты с лямбдавыражениями( возможно ли)
Затестить возможность клонирования.
Добавить к Person обьект Car (марка, год машины)
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("Tesla",2);
        Person p1 = new Person("Horus","male",88,c1);
        Person p2 = new Person("Roboute","male",99,"Honda",12);
        p2.getCar().setCarYear(8);
        Person p3 = p2.clone();
        //p3.setName("Roboute Second");
        Person p4 = new Person("Alisa","famale",20,"Subaru",5);
        Person p5 = new Person("Bona","famale",33,"Renault",15);
        Person p6 = p5.clone();
        //p6.setName("Bono Second");
        p6.getCar().setModel("Tornado");
        p6.getCar().setCarYear(4);

        Supplier<Person> personFactory = ()->{
            return new Person("Robot","unknown",1,"RoboCar",1);
        };

        Supplier<Person> personFactorySetName = ()->{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myName = null;
            System.out.println("Введите имя : ");
            try {
                myName = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Person p = new Person();
            p = new Person(myName,"unknown",1,"RoboCar",1);
            return p;
        };

        Person p7 = personFactory.get();
//        p7.myInfo();

        Comparator<Person> pcomp = new Person.PersonNameComparator().thenComparing(new Person.PersonAgeComparator());
        TreeSet<Person> tree = new TreeSet<>(pcomp);
        //TreeSet<Person> tree = new TreeSet<>();
        tree.add(p1); //Horus
        tree.add(p2); //Roboute
        tree.add(p3); // clone - Roboute
        tree.add(p4); //Alisa
        tree.add(p5); //Bona
        tree.add(p6); //clone - Bona (car Tornado)
        tree.add(p7); // Robot
//        tree.add(personFactory.get()); //Robot
        tree.forEach(System.out::println);
//        Person p8 = personFactorySetName.get();
//        p8.myInfo();




    }
}
