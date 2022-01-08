package Junior.FirstCourse.Lections.ProgLang.Repeat.InnerClasses21;

public class Test2Extends {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Ivan",33,10,"Healing");
        doc.eat();
        doc.work();

        Employee doc2 = new Doctor("Oxi",23,3,"Healing");
        doc2.eat();
        doc2.work();
        System.out.println(doc instanceof Employee);
        System.out.println("NEW----------------------------");
        System.out.println(doc);


    }
}

class Employee{
    //если елемент private Стринг нейм то он не будет доступен в классе (наследован name) (через Сетеры работать тогда с ними паблик сетНаме)

    private String name;
    private int age;
    private int experience;

    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void work(){
        System.out.println("Working");
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}

class Doctor extends Employee{
     private String specialisation;

    public Doctor(String name, int age, int experience, String specialisation) {
        super(name, age, experience);
        this.specialisation = specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public void work(){
        System.out.println("Healing");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", experience=" + getExperience() + '\'' +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }
}



