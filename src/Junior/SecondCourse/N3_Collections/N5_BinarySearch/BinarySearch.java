package Junior.SecondCourse.N3_Collections.N5_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-13);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        Collections.sort(arrayList);
//        arrayList.forEach(x-> System.out.println(x));
//        int index1 = Collections.binarySearch(arrayList,10);
//        System.out.println("Index = " + index1);

        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8542);
        Employee emp4 = new Employee(15, "Mariya", 5678);
        Employee emp5 = new Employee(182, "Kolya", 125);
        Employee emp6 = new Employee(15, "Sasha", 9874);
        Employee emp7 = new Employee(250, "Elena", 1579);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
        int index2 = Collections.binarySearch(employeeList
                , new Employee(250, "Elena", 1579));
        System.out.println("Index2 = " + index2);

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.getId() - anotherEmp.getId();
        if (result == 0) {
            result = this.getName().compareTo(anotherEmp.getName());
        }
        return result;
    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        int result = emp1.getId() - emp2.getId();
        if (result == 0) {
            result = emp1.getName().compareTo(emp2.getName());
        }
        return result;
    }
}


