package Junior.FirstCourse.HomeWork.HW22_Extends;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Kysaka");
        dog.play();
        System.out.printf("I have %s paws.",dog.getPaw());
        Cat cat = new Cat("Nyavkalo");
        cat.sleep();
        dog.setName("Goody");
        System.out.println(dog.getName());
    }

}
