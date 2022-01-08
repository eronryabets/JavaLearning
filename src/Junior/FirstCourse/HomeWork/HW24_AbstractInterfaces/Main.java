package Junior.FirstCourse.HomeWork.HW24_AbstractInterfaces;

public class Main {
    public static void main(String[] args) {
        Mechenosec sword = new Mechenosec("Sword");
        sword.eat();
        sword.swim();
        sword.sleep();
        Penguin pingy = new Penguin("Pingy");
        pingy.eat();
        pingy.speak();
        pingy.fly();
        pingy.sleep();
        Lion lev = new Lion("Lev");
        lev.run();
        lev.eat();
        lev.sleep();
        lev.speak();
        Mammal lev2 = new Lion("Lviv");
        lev2.run();
        lev2.eat();
        lev2.sleep();
        lev2.speak();


    }
}
