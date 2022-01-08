package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting.TestAnimal;

public class Test1 {
    public static void main(String[] args) {
        Animal an1 = new Animal("msCat");
        System.out.println(an1);
        Animal d1 = new Dog("mrDog");
//        d1.eat();
//        d1.sleep();
//        d1.isAnimal();
//        ((Dog) d1).isDog();
//        ((Dog) d1).bark();
        Dog d2 = (Dog) new Animal("djDog");

//

    }
}
