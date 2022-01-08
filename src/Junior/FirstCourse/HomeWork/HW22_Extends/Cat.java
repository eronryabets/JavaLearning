package Junior.FirstCourse.HomeWork.HW22_Extends;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
        System.out.printf("I am a cat and my name is: %s !\n",name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
