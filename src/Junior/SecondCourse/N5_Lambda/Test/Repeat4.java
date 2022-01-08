package Junior.SecondCourse.N5_Lambda.Test;

import Junior.SecondCourse.SHK.Animals.Animal;
import java.util.List;
import static Junior.SecondCourse.SHK.Animals.Animal.*;

public class Repeat4 {
    public static void main(String[] args) {
        List<Animal> animalList = getAnimals();
        checkerInfo(animalList,a -> a.getAge() > 20);


    }

    public static void checkerInfo(List <Animal> animalList,Checkers checker){
        for(Animal animal : animalList){
            if(checker.check(animal)){
                System.out.println(animal);
            }
        }
    }

}

interface Checkers {
    boolean check (Animal animal);
}
