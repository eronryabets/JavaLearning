package Junior.FirstCourse.Lections.Les24AbstractAndInterfaces;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number,double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Внутри mailCheck класса Salary ");
        System.out.println("Отправляем чек" + getName() + " с зарплатой " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() { //унаследовали метод от абстрактного класса и переопределили его.
        System.out.printf("Вычисляем заработную плату для %s  = %f;", getName(),salary/52);
        return salary/52;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", number=" + getNumber() + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        Salary alex = new Salary("Alex","Dnepr 36",1,670.8);
        System.out.println(alex.getName());
        System.out.println(alex);
        alex.computePay();
    }
}
