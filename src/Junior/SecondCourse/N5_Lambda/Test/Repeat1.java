package Junior.SecondCourse.N5_Lambda.Test;
//Сделать лямду с булеаном

import Junior.SecondCourse.SHK.Animals.Animal;
import Junior.SecondCourse.SHK.Animals.Classification;

import java.util.List;
import java.util.stream.Collectors;

import static Junior.SecondCourse.SHK.Animals.Animal.*;

public class Repeat1 {
    public static void main(String[] args) {
        List<Animal> animalList = getAnimals();
        Animal animal1 = new Animal("Dog",3, Classification.PREDATOR);
       //просто вспомню // сделать потом при помощи интерфейсов
        List<Animal> predators = animalList.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
        predators.forEach(System.out::println);

    }

    public static void print(List<Animal> animals, LambdasBoolean checker){
        for(Animal animal : animals){
            if(checker.checkAnimal(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}



interface LambdasBoolean{
    boolean checkAnimal(Animal a);
}
//
//class PredatorCheck implements  LambdasBoolean{
//
//    @Override
//    public boolean checkAnimal(Animal a) {
//        return a.getClassification() = Classification.valueOf("PREDATOR");
//    }
//}