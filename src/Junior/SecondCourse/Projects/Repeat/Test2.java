package Junior.SecondCourse.Projects.Repeat;

class Animal {
    public void move() {
        System.out.println("Животные могут двигаться");
    }
}
class Dog extends Animal {
    public void move() {
        System.out.println("Собаки могут ходить и бегать");
    }
    public void bark(){
        System.out.println("Gav gav!");
    }
}
public class Test2 {

    public static void main(String args[]) {
        Animal a = new Animal();   // Animal - ссылка и объект
        Animal b = (Dog)new Dog();   // Animal - ссылка, но Dog - объект

        a.move();   // Запускает метод в классе Animal
        b.move();   // Запускает метод в классе Dog
        ((Dog)b).bark(); //только с КАСТОМ!
    }
}