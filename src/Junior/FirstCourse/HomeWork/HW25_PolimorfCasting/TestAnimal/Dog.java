package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting.TestAnimal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("Dog eat");
    }
    @Override
    public void sleep(){
        System.out.println("Dog sleep");
    }
    public void isDog(){
        System.out.println("This is a dog");
    }

    public void bark(){
        System.out.println("Brrrr vafff vafff gauf...");
    }

}
