package Junior.FirstCourse.Projects.Salary;

public interface SalaryBonus {
    public static Employee bonus(Employee emp){
        if (emp instanceof Engineer){
            emp.setSalary(emp.getSalary() + emp.getSalary() * 0.25);
            System.out.println("Зарплата Инжинера увеличина на 25% и теперь = " + emp.getSalary());
        }
        else if(emp instanceof Cook){
            emp.setSalary(emp.getSalary() + emp.getSalary() * 0.15);
            System.out.println("Зарплата Повара увеличина на 15% и теперь = " + emp.getSalary());
        }
        else if(emp instanceof Security){
            emp.setSalary(emp.getSalary() + emp.getSalary() * 0.10);
            System.out.println("Зарплата Охранника увеличина на 10% и теперь = " + emp.getSalary());
        }
        else if(emp instanceof Employee){
            emp.setSalary(emp.getSalary() + emp.getSalary() * 0.07);
            System.out.println("Зарплата сотрудника увеличина на 7% и теперь = " + emp.getSalary());
        }
        return emp;
    }
    public void sleep();
}
