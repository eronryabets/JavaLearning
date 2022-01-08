package Junior.SecondCourse.N3_Collections.N5_BinarySearch.MyExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
//реализовать поиск по ID
//реализовать поиск (просто вывод на экран)  при помощи геттеров, по различным полям обьекта

public class MyExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8542);
        Employee emp4 = new Employee(15, "Mariya", 5678);
        Employee emp5 = new Employee(182, "Kolya", 125);
        Employee emp6 = new Employee(15, "Sasha", 9874);
        Employee emp7 = new Employee(250, "Elena", 1579);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        Collections.sort(employeeList);
        employeeList.forEach(x-> System.out.println(x));
        int index1 = Collections.binarySearch(employeeList,new Employee(15, "Mariya", 5678));
        System.out.println("Index 1 = " + index1);


//        for(Employee emp : employeeList){
//            if(emp.getId() == 15){
//                System.out.println("ID found = " + employeeList.indexOf(emp));
//            }
//        }

        System.out.println(employeeList.indexOf(emp1));
        Employee.searchID(employeeList,15);

        System.out.println("Predicated ===========================");
        Employee.testEmployee(employeeList, emp -> emp.getId() == 15);





    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static void searchID(ArrayList<Employee> list, int id){
        for(Employee emp : list){
            if(emp.getId() == 15){
                System.out.println("ID found = " + list.indexOf(emp));
            }
        }
    }

    public static void testEmployee(ArrayList<Employee> list, Predicate <Employee> employeePredicate){
        for(Employee emp : list){
            if(employeePredicate.test(emp)){
                System.out.println(emp);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp1) {
        int result = 0;
        result = this.getId()-emp1.getId();
        if(this.getId() == emp1.getId()){
            result = this.getName().compareTo(emp1.getName());
        }
        return result;
    }
}