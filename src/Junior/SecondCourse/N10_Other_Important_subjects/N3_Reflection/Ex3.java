package Junior.SecondCourse.N10_Other_Important_subjects.N3_Reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10,"Alex","IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 1500);
        System.out.println(employee);

    }
}
