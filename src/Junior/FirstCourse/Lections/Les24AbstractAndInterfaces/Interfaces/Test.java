package Junior.FirstCourse.Lections.Les24AbstractAndInterfaces.Interfaces;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.newMethod();
        Driver d1 = new Driver();
        d1.newMethod();

    }
}

class Employee {
    double salary = 100;
    String name = "userName";
    int age;
    int experience;
    void eat (){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}

class Teacher extends Employee implements Help_able {
    int pupils;
    void teach(){
        System.out.println("Teaching");
    }

    @Override
    public void help() {
        System.out.println("Teacher helping");
    }

    @Override
    public void watterToFire(String watter) {
        System.out.printf("Teacher - %s to fire",watter);

    }

    @Override
    public void newMethod() {
        System.out.println("New override method from Teacher");
    }
}

class Driver extends Employee implements Help_able,Swim_able {
    String car;
    void teach(){
        System.out.println("Driving");
    }

    @Override
    public void help() {
        System.out.println("Driver help");
    }

    @Override
    public void watterToFire(String watter) {
        System.out.printf("Driver - %s to fire",watter);
    }

    @Override
    public void swim() {
        System.out.println("Driver swim");
    }
}
interface Help_able{
    public final static String w = "Watter"; //это и так поумолчанию public final static
    void help();
    void watterToFire(String watter);
    default void newMethod(){
        System.out.println("new Method default from Help_able");
    }
}
interface Swim_able{
    void swim();
}

