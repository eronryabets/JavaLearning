package Junior.SecondCourse.Projects;

import static Junior.SecondCourse.Projects.Animal.eat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int number = Integer.parseInt(reader.readLine());
        double d = Double.parseDouble(reader.readLine());

        Dog dog1 = new Dog("MAX");
        eat(dog1);
        System.out.println(dog1 instanceof Animal);//true

    }
}

class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public static void eat(Animal animal){
        System.out.println(animal.name + "eat");
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}

class Car {
    static int a = 5;
//    public static void main(String[] args) {
//        Car c = new Car();
//        System.out.println(c.a);
//        System.out.println(c instanceof Object); //true
//        c = null;
//        System.out.println(c.a);
//    }
}