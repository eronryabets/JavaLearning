package Junior.FirstCourse.Lections.Les25Polimorf.Employee;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
//        emp1.work();
//        emp2.work();
//        emp3.work();
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Teacher(), new Driver(), new Doctor()};
        Help_able [] array3 = {new Teacher(), new Driver(), new Doctor()};
        Employee [] array4 = {emp1,emp2,emp3};

        for(Employee emp:array4){
            emp.work();
        }

    }
}

abstract class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work(); //если бы не было етого абстрактного метода, то emo1.work() не заработал бы.
}

class Teacher extends Employee implements Help_able{
    void work(){
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements Help_able{
    void work(){
        System.out.println("Driver works");
    }
    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able{
    void work(){
        System.out.println("Doctor works");
    }
    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}
interface Help_able{
    void help();
}
