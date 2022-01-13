package Junior.SecondCourse.Projects.Repeat.Example1;

public class Pupils extends Person {
    private String grade;

    public Pupils(String name, Team team, double rate, String grade) {
        super(name, team, rate);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Pupils{" +
                "name=" + getName() +
                ", team=" + getTeam() +
                ", rate=" + getRate() +
                ", grade='" + grade + '\'' +
                '}';
    }
}
