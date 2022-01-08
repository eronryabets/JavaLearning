package Junior.SecondCourse.N6_Streams.N0_1_All.MyExample;

import java.util.Objects;

public class Person {
    final private String name;
    final private int age;
    private double rate;
    private Car car;
    private Classification classification;

    public Person(String name, int age, double rate, Car car, Classification classification) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.car = car;
        this.classification = classification;
    }

    public Person(String name, int age, double rate, String carModel,int carMaxSpeed, Classification classification) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.car = new Car(carModel, carMaxSpeed);
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", car=" + car +
                ", classification=" + classification +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Double.compare(person.getRate(), getRate()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getCar(), person.getCar()) &&
                getClassification() == person.getClassification();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getRate(), getCar(), getClassification());
    }
}
