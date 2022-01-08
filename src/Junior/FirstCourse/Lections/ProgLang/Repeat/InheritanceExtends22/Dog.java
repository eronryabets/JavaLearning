package Junior.FirstCourse.Lections.ProgLang.Repeat.InheritanceExtends22;

public class Dog extends Animal {

    private int feet;

    public Dog(String name, int age, int feet) {
        super(name, age);
        this.feet = feet;
    }

    @Override
    public void voice() {
        System.out.println("gav gav");
    }

    public void bark(){
        System.out.println("Grrrr waf wag");
    }

}
