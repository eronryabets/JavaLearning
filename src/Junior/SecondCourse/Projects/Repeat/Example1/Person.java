package Junior.SecondCourse.Projects.Repeat.Example1;

import java.util.List;
import java.util.Objects;

public abstract class Person<T extends Person> {
    private StringBuilder name;
    private Team team;
    private double rate;

    public Person(String name, Team team, double rate) {
        setName(name);
        this.team = team;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    private void setRate(double rate) {
        if (rate < 0 || rate > 100) {
            System.out.println("Недопустимое значение!");
        } else {
            this.rate = rate;
        }
    }

        public StringBuilder getName() {
        StringBuilder n = name;
        return n;
    }

    public void setName(String name) {
        this.name = new StringBuilder(name);
    }

    public Team getTeam() {
        return team;
    }

//    private void setTeam(Team team) {
//        this.team = team;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Double.compare(person.getRate(), getRate()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                getTeam() == person.getTeam();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeam(), getRate());
    }

    public static void showNames(List<? extends Person> people) {
        people.stream().forEach(x -> {
            System.out.println(x.getName());
        });
    }
    public void showYourName(){
        System.out.println(this.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", team=" + team +
                ", rate=" + rate +
                '}';
    }
}
