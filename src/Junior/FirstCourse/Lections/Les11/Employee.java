package Junior.FirstCourse.Lections.Les11;

public class Employee {
    String name ;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void salaryX2 (){
        salary *= 2;
        System.out.println("Now " + name + "'s salary is " + salary);
    }

    //в метод попадает не сам аргумент, а его копия!
    //при помощи копий мы можем менять элементы обьекта, на не сам обьект!
    /*public static void swap(Employee emp1, Employee emp2){
        System.out.println("Before method : emp1 is " + emp1.name +";");
        System.out.println("Before method : emp2 is " + emp2.name +";");
        Employee emp3 = emp1;
        emp1 = emp2;
        emp2 = emp3;
        System.out.println("After method : emp1 is " + emp1.name +";");
        System.out.println("After method : emp2 is " + emp2.name +";");
    }*/
    public static void swap(Employee emp1, Employee emp2){
        Employee emp3 = new Employee();
        emp3.name = emp1.name;
        emp3.salary = emp1.salary;
        emp1.name = emp2.name;
        emp1.salary = emp2.salary;
        emp2.name = emp3.name;
        emp2.name = emp3.name;

    }


    @Override
    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Max",900.3);
        emp1.salaryX2();
        Employee emp2 = new Employee("Sergio",888);
        System.out.println(emp1.salary);
        swap(emp1,emp2);


    }
}
