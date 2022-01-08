package Junior.FirstCourse.HomeWork.HW22_Extends;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
        System.out.printf("I am a dog and my name is: %s !\n",name);
    }
    public void play(){
        System.out.println("Dog plays");
    }

}
