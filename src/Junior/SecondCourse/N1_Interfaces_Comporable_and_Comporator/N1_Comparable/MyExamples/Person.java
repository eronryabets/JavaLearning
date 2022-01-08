package Junior.SecondCourse.N1_Interfaces_Comporable_and_Comporator.N1_Comparable.MyExamples;

import java.util.Comparator;

public class Person implements Cloneable{
     //private final String name;
     private String name;
     private String sex;
     private int age;
     private Car car;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String sex, int age, Car car) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.car = car;
    }

    public Person(String name, String sex, int age, String carModel, int carYear) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.car = new Car(carModel,carYear);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCarModel(){
        return car.getModel();
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [ " +
                "Name :'" + name + '\'' +
                ", Sex :'" + sex + '\'' +
                ", Age :" + age + '\'' +
                ", Car model :" + car.getModel() + '\'' +
                ", Car old :" + car.getCarYear() +
                ']';
    }

    public static void info(Object obj){
        System.out.println(obj);
    }

    public void myInfo(){
        System.out.println(toString());
    }

    public Person clone() throws CloneNotSupportedException{
        Person newPerson = (Person) super.clone();
        newPerson.car=(Car) car.clone();
        return newPerson;
    }


    //InnerClass
    public static class PersonCarModelComparator implements Comparator<Person> {

        public int compare(Person a, Person b){

            return a.getCar().getModel().compareTo(b.getCar().getModel());
        }
    }

    public static class PersonNameComparator implements Comparator<Person> {

        public int compare(Person a, Person b){

            return a.getName().compareTo(b.getName());
        }
    }

    public static class PersonAgeComparator implements Comparator<Person>{

        public int compare(Person a, Person b){

            if(a.getAge()> b.getAge())
                return 1;
            else if(a.getAge()< b.getAge())
                return -1;
            else
                return 0;
        }
    }
}
