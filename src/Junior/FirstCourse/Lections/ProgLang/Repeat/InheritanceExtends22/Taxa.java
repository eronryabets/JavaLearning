package Junior.FirstCourse.Lections.ProgLang.Repeat.InheritanceExtends22;

public class Taxa extends Dog{
    public Taxa(String name, int age, int feet) {
        super(name, age, feet);
    }
    public void jump(){
        System.out.println("Taxa is jumping");
    }
    public void bark(){
        System.out.println("Taxa is barking : gav gav");
    }
}
