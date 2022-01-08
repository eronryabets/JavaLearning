package Junior.FirstCourse.Lections.ProgLang.Repeat.Overriding23;
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Animal",1);
        Animal d = new Dog("AnDog",2,1);
        Dog dog = new Dog("Dog",3,3);
        a.voice();
        Animal.whereIsAnimal();
        Dog.whereIsAnimal();
        dog.gav();

    }
}
