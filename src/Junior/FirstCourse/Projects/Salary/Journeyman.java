package Junior.FirstCourse.Projects.Salary;

public class Journeyman extends Employee {
    public Journeyman(String name, String skill, double salary) {
        super(name, skill, salary);
    }

    @Override
    public void sleep() {
        System.out.println("I didn't slept! :)");
    }
}
