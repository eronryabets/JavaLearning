package Junior.FirstCourse.Projects.Salary;

public class Engineer extends Employee{
    public Engineer(String name, String skill, double salary) {
        super(name, skill, salary);
    }
    @Override
    public void skills(){
        System.out.println("I am Engineer and my skills ar ...");
    }
    @Override
    public void work(){
        System.out.println("Repair");
    }

    @Override
    public void sleep() {
        System.out.println("Engineer is sleeping");
    }
}
