package Junior.SecondCourse.Projects.Repeat.AllRepeat;

import java.util.Comparator;
import java.util.Objects;

public class Person  implements Cloneable, Comparable<Person>{
    private int id;
    private String name;
    private int yearsOld;
    private Car car;
    private static int count;

    public Person(String name, int yearsOld) {
        id = count+1;
        this.name = name;
        this.yearsOld = yearsOld;
        count+= 1;
    }

    public Person(String name, int yearsOld, Car car) {
        id = count+1;
        this.name = name;
        this.yearsOld = yearsOld;
        this.car = car;
        count+= 1;
    }

    public Person(String name, int yearsOld, String model,int yearMade, int horsePower) {
        id = count+1;
        this.name = name;
        this.yearsOld = yearsOld;
        this.car = new Car(model,yearMade,horsePower);
        count+= 1;
    }

    public void setCarOptions(String model,int yearMade, int horsePower){
        Car newCar = new Car(model,yearMade,horsePower);
        this.setCar(newCar);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearsOld=" + yearsOld +
                ", car=" + car +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() &&
                getYearsOld() == person.getYearsOld() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getCar(), person.getCar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getYearsOld(), getCar());
    }

    public Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        return clone;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int result = this.id - anotherPerson.id;
        return result;
    }

    public static class PersonIdComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.id-o2.id;
        }
    }
}

