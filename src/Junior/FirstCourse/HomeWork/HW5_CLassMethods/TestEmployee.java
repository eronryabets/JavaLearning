package Junior.FirstCourse.HomeWork.HW5_CLassMethods;

public class TestEmployee {
    public static void main(String[] args) {
        Employee sergio = new Employee("Sergey",32,800,"Operator");
        Employee maxim = new Employee("Maxim",24,900,"Operator");
        Employee.salaryOnDisplay(sergio);
        sergio.increaseSalaryX2();
        Employee.salaryOnDisplay(sergio);
        System.out.println(sergio);
        System.out.println(maxim);
    }
}
