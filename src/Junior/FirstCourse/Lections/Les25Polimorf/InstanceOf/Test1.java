package Junior.FirstCourse.Lections.Les25Polimorf.InstanceOf;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        String s1 = null;

        System.out.println(s1 instanceof String); //false
        System.out.println(emp1 instanceof Employee); //true
        System.out.println(emp1 instanceof Teacher); //true
        System.out.println(emp1 instanceof Driver); //false




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
