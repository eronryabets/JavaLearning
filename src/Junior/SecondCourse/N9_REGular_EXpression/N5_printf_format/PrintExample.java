package Junior.SecondCourse.N9_REGular_EXpression.N5_printf_format;

public class PrintExample {

    static void employeeInfo(Employee emp){
        System.out.printf("%03d \t User %-12s \t %-12s \t %,.1f \n"
                ,emp.id, emp.name, emp.surname, emp.salary*(1+emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Alex","Xen",12345,0.15);
        Employee emp2 = new Employee(15,"Inna","Fly",12345,0.15);
        Employee emp3 = new Employee(123,"Makaron","Korn",12345,0.15);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String myString = String.format("%03d \t User %-12s \t %-12s \t %,.1f \n"
                ,1,"Alex","Xen",12345*(1+0.15));
        System.out.println(myString);

    }
}

class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}