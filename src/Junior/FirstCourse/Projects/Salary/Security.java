package Junior.FirstCourse.Projects.Salary;

public class Security extends Employee{
    public Security(String name, String skill, double salary) {
        super(name, skill, salary);
    }
    @Override
    public void skills(){
        System.out.println("I am Security and my skills ar ...");
    }
    @Override
    public void work(){
        System.out.println("Watching");
    }
    @Override
    public void sleep() {
        System.out.println("Security is sleeping");
    }
}
