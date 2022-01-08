package Junior.SecondCourse.SHK.Animals;

import java.util.List;

//import Junior.SecondCourse.SHK.Animals.Animal;
//import static Junior.SecondCourse.SHK.Animals.Animal.*;

public class Animal {
    private final String name;
    private final int age;
    private final Classification classification;

    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classification=" + classification +
                '}';
    }
    public static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон",20, Classification.HERBIVORE),
                new Animal("Лев",10, Classification.PREDATOR),
                new Animal("Гиена",10, Classification.PREDATOR),
                new Animal("Жираф",7, Classification.HERBIVORE),
                new Animal("Гибон",35, Classification.OMNIVOROUS),
                new Animal("Лошадь",36, Classification.HERBIVORE),
                new Animal("Рысь",2, Classification.HERBIVORE),
                new Animal("Динозавр",200, Classification.PREDATOR)
        );
    }
}
