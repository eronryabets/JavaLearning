package Junior.SecondCourse.N1_Interfaces_Comporable_and_Comporator.N2_Comparator.HW;

/*
Создадим обьект Люди, Добавим к ним обьект Кар.
Затестим вывод инфы персона через лямблу Consumer
Создадим TreeSet, реализуем Comparable через сравнение ID
п.с. затем создадим два класса расширяющие Comparator - по CarYear и PersonAge
и пусть TreeSet принимает какой то из этих компораторов, как главное условие сортировки.
 */

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class HomeWork {
    public static void main(String[] args) {
        Person p1 = new Person("Alex",22,4500,"Liberty200",20);
        Consumer<Person> print = System.out::println;
        //print.accept(p1);
        TreeSet<Person> PersonTreeSet = new TreeSet<>(new PersonAgeComparator());
        System.out.println("Alex ID : "+p1.getId());
        Person p2 = new Person("Balex",33,4700,"Liberty120",17);
        Person p3 = new Person("Trilex",45,4650,"Liberty3000",12);
        Person p4 = new Person("Merony",35,4200,"NinTree",1);
        Person p5 = new Person("Astarta",16,5600,"Potrexo Light",27);
        Person p6 = new Person("Covenant",62,12200,"Mamba Gonzo",6);
        Person p7 = new Person("Horus",25,7700,"Pertuho Pi700",5);
        //System.out.println("Balex ID : "+p2.getId());
        //System.out.println("Person Amount : "+Person.getPersonAmount());
        PersonTreeSet.add(p1);
        PersonTreeSet.add(p5);
        PersonTreeSet.add(p7);
        PersonTreeSet.add(p4);
        PersonTreeSet.add(p2);
        PersonTreeSet.add(p6);
        PersonTreeSet.add(p3);
        PersonTreeSet.forEach(System.out::println);

    }
}

class Person implements Comparable<Person> {
    private final int id;
    private static int PersonAmount;
    private String name;
    private int age;
    private int salary;
    private Car car;

    public Person( String name, int age, int salary, String carModel, int carYear) {
        this.id = PersonAmount+1;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.car = new Car(carModel, carYear);
        PersonAmount++;
    }

    public int getId() {
        return id;
    }

    public static int getPersonAmount() {
        return PersonAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person: [" +
                "ID: " + getId() +
                ", Name: " + name +
                ", Age: " + age +
                ", Salary: " + salary +
                " (car model: " + getCar().getModel() +
                ", car year: " + getCar().getYear() +
                ")];";
    }

    @Override
    public int compareTo(Person anotherP) {
        return this.getId()-anotherP.getId();
    }
}

class Car{
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class CarModelComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getCar().getModel().compareTo(p2.getCar().getModel());
    }

}

class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge()-p2.getAge();
    }
}