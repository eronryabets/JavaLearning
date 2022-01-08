package Junior.FirstCourse.Lections.Les23Overriding;

public class Les23 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.eat();
        doc.work();
        //System.out.println(doc instanceof Employee);

        Employee emp1 = new Doctor();
        Employee emp2 = new Driver();
        Employee emp3 = new Teacher();
        Doctor doc2 = new Surgeon();
        doc2.work();
        emp1.work();

    }
}

class Employee{
    //если елемент private Стринг нейм то он не будет доступен в классе (наследован name) (через Сетеры работать тогда с ними паблик сетНаме)
    public String name;
    public int age;
    public int experience;

    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void work(){
        System.out.println("Working");
    }

}

class Doctor extends Employee{
    String specialisation;
    @Override
    public void work(){
        System.out.println("Healing");
    }
}
class Teacher extends Employee{
    String book;
    @Override
    public void work(){
        System.out.println("Driving");
    }
}
class Driver extends Employee{
    String car;
    @Override
    public void work(){
        System.out.println("Teaching");
    }
}

class Surgeon extends Doctor{
    String scalpel;
}



