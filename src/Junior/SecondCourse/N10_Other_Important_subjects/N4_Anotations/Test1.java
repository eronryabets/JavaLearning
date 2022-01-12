package Junior.SecondCourse.N10_Other_Important_subjects.N4_Anotations;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Alex");
        p.showInfo();


    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
    @Deprecated //Parent
    void showInfo(){
        System.out.println("It's Parent class. Name = " + name);
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }
    @Override //Child
    void showInfo(){
        System.out.println("It's Child class. Name = " + name);
    }

}