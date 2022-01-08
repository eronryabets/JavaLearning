package Junior.SecondCourse.N1_Interfaces_Comporable_and_Comporator.N2_Comparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
       // Comparator<Employee> employeeComparator = new IdComprarator();
        Employee emp1 = new Employee(1,"Egor","Ivanov",8500);
        Employee emp2 = new Employee(33,"Petro","Kalinin",8500);
        Employee emp3 = new Employee(21,"Egor","Salamon",8500);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        System.out.println("Before sorting : \n" + empList);
        Collections.sort(empList,new NameComprarator());
        System.out.println("After sorting : \n" + empList);

    }
}

class Employee implements Comparable<Employee>{
    private int id ;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another) {
        return this.getId()-another.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, salary);
    }
}

//class IdComprarator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        return emp1.getId()-emp2.getId();
//    }
//}

class NameComprarator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

class SalaryComprarator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary()-emp2.getSalary();
    }
}
/*
@Override
    public int compareTo(Employee anotherEmp) { //return Integer.compare(this.getId(), o.getId());
        if(this.getId()>anotherEmp.getId()){
            return 1;
        }
        else if(this.getId()<anotherEmp.getId()){
            return -1;
        }
        else {
            return 0;
        }
    }
    ========================
        public int compareTo(Employee anotherEmp) {
        int res = this.getName().compareTo(anotherEmp.getName());
        if (res ==0){
            res = this.getSurname().compareTo(anotherEmp.getSurname());
        }
        return res;
        //return Integer.compare(this.getId(), o.getId());
        //return this.getId()-anotherEmp.getId();
        //return this.getName().compareTo(anotherEmp.getName());
    }
 */