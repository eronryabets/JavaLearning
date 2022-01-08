package Junior.SecondCourse.Projects.People;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int year;
    private int rate;
    private Car car;

    public Person(String name, String surname, int year, int rate, Car car) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        setRate(rate);
        this.car = car;
    }

    public Person(String name, String surname, int year, int rate,
                  String brand, String model, String color, String engine, int horsePower) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.rate = rate;
        this.car = new Car(brand,model,color,engine,horsePower);
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getRate() {
        return rate;
    }

    public Car getCar() {
        return car;
    }

    public void setRate(int rate) {
        if(rate < 0){
            throw new IllegalArgumentException("rating can't be < 0");
        }
        else if(rate > 100) {
            throw new IllegalArgumentException("rating can't be > 100");
        }
        else this.rate = rate;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getYear() == person.getYear() &&
                Integer.compare(person.getRate(), getRate()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(getCar(), person.getCar());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", rate=" + rate +
                ", car=" + car +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), surname, getYear(), getRate(), getCar());
    }


    @Override
    public int compareTo(Person o) {
        return this.rate-o.rate;
    }
}
