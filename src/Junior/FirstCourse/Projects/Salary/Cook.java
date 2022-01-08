package Junior.FirstCourse.Projects.Salary;

public class Cook extends Employee {
    public Cook(String name, String skill, double salary) {
        super(name, skill, salary);
    }
    @Override
    public void skills(){
        System.out.println("I am Cook and my skills ar ...");
    }
    @Override
    public void work(){
        System.out.println("Cooking");
    }
    @Override
    public void sleep() {
        System.out.println("Cook is sleeping");
    }
}
