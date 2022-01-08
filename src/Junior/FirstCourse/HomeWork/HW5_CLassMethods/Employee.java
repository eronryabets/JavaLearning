package Junior.FirstCourse.HomeWork.HW5_CLassMethods;

public class Employee {
    final int id;
    String surname;
    int age;
    double salary;
    String department;
    static int nextId;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String surname, int age, double salary, String department) {
        nextId++;
        this.id = nextId;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }

    public static void salaryOnDisplay (Employee person){
        System.out.println(person.surname + "'s salary is " + person.salary + ";");
    }

    /*public static double increaseSalaryX2(Employee person){
        double sumX2 = person.getSalary() * 2;
        person.salary = sumX2;
        return person.salary;
    }*/

    //v1.2
    public  double increaseSalaryX2(){
        salary *= 2;
        return salary;
    }



    @Override
    public String toString() {
        return "Emloyee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
