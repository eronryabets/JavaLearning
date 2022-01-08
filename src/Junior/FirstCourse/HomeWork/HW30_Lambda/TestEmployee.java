package Junior.FirstCourse.HomeWork.HW30_Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {
    public static void printEmployee(Employee emp) {
        System.out.printf("Name: %s; \nDepartment: %s; \nSalary : %d;\n", emp.getName(), emp.getDepartment(), emp.getSalary());
    }

    public static void filtrationEmployee(ArrayList<Employee> list, Predicate<Employee> predicate) {
        System.out.println("filtrationEmployee starting...");
        for (Employee emp : list) {
            if (predicate.test(emp)) {
                printEmployee(emp);
            }
        }
    }

}



