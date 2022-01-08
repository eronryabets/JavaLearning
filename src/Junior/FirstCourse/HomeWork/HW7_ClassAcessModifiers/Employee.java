package Junior.FirstCourse.HomeWork.HW7_ClassAcessModifiers;

public class Employee {
    final int Id;
    public String surname;
    public int age;
    private double salary;
    public String department;
    public static int nextId;


    public Employee(String surname, int age, double salary, String department) {
        nextId++;
        this.Id = nextId;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }

     Employee(String surname, double salary) {
        nextId++;
        this.Id = nextId;
        this.surname = surname;
        this.salary = salary;

    }

     private Employee(String surname, double salary, int age){
        this(surname,salary);
        //nextId++; //это все имеется в верхнем конструкторе
        //this.id = nextId;
        //this.surname = surname;
        //this.salary = salary;
        this.age = age;
    }



    public static void salaryOnDisplay (Employee person){
        System.out.println(person.surname + "'s salary is " + person.salary + ";");
    }

    /*public static double increaseSalaryX2(Employee person){
        double sumX2 = person.getSalary() * 2;
        person.salary = sumX2;
        return person.salary;
    }*/

    //v1.2
    public  double increaseSalaryX2(){
        salary *= 2;
        return salary;
    }

    //Homework

    public void salaryOnDisplay(){
        System.out.println(salary);
    }

    public void surnameOnDisplay(){
        System.out.println(surname);
    }

    public void idOnDisplay(){
        System.out.println(Id);
    }


    //GET SET

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "Id=" + Id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee alex = new Employee("Alex",500,24); //private access - доступен только в классе своем
        alex.idOnDisplay();
        alex.surnameOnDisplay();
        alex.salaryOnDisplay();

        Employee oleg = new Employee("Oleg",600,28);
        oleg.idOnDisplay();
        oleg.surnameOnDisplay();
        oleg.salaryOnDisplay();
    }
}
