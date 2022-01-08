package Junior.FirstCourse.Projects.Salary;

public abstract class Employee implements SalaryBonus{
    private String name;
    private String skill;
    private double salary;

    public Employee(String name, String skill, double salary) {
        setName(name);
        this.skill = skill;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public double getSalary() {
        return salary;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }
    }

    private void setName(String name) {
        if(name.length() > 1){
            this.name = name;
        }

    }

    public void skills(){
        System.out.println("Employee skills");
    }

    public void work(){
        System.out.println("I am working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", salary=" + salary +
                '}';
    }
}
