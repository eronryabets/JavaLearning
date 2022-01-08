package Junior.FirstCourse.Lections.Les22Encapsulation;

public class Test2Extends {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.eat();
        doc.work();

        Employee doc2 = new Doctor();
        doc2.eat();
        doc2.work();
        System.out.println(doc instanceof Employee);

    }
}

class Employee{
    //если елемент private Стринг нейм то он не будет доступен в классе (наследован name) (через Сетеры работать тогда с ними паблик сетНаме)
    public String name;
    public int age;
    public int experience;

    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
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



