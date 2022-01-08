package Junior.FirstCourse.HomeWork.HW30_Lambda;

import java.util.ArrayList;

import static Junior.FirstCourse.HomeWork.HW30_Lambda.TestEmployee.filtrationEmployee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alex", "IT", 2000);
        Employee emp2 = new Employee("Xena", "IT", 1000);
        Employee emp3 = new Employee("Tolik", "CSS", 800);
        Employee emp4 = new Employee("Evgen", "OP", 500);
        Employee emp5 = new Employee("Eugen", "OP", 450);
        Employee emp6 = new Employee("OP", "OP", 450);
        //printEmployee(emp1);

        ArrayList<Employee> arList = new ArrayList<>();
        arList.add(emp1);
        arList.add(emp2);
        arList.add(emp3);
        arList.add(emp4);
        arList.add(emp5);
        arList.add(emp6);

//        for (Employee emp : arList){
//            printEmployee(emp);
//            System.out.println("---------------------");
//        }
        System.out.println("1) department == IT; salary > 900");
        filtrationEmployee(arList, employee -> employee.getDepartment() == "IT" && employee.getSalary() > 900);
        System.out.println("-------------------------------------------------------");

        System.out.println("2) name = first 'E'; salary != 450");
        filtrationEmployee(arList, employee -> employee.getName().startsWith("E") && employee.getSalary() != 450);
        System.out.println("-------------------------------------------------------");

        System.out.println("3) department name == name emp");
        filtrationEmployee(arList, employee -> employee.getDepartment() == employee.getName());
    }
}
