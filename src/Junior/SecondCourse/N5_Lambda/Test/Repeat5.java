package Junior.SecondCourse.N5_Lambda.Test;

import Junior.SecondCourse.SHK.Animals.Animal;
import Junior.SecondCourse.SHK.Animals.Classification;

import java.util.List;
import static Junior.SecondCourse.SHK.Animals.Animal.*;

public class Repeat5 {
    public static void main(String[] args) {
        List<Animal> animalList = getAnimals();
        myCheckInfo3(animalList,animal -> animal.getClassification().equals(Classification.PREDATOR));
    }

    static public void myCheckInfo3(List<Animal> list, Check3 check){
        for(Animal animal : list){
            if(check.checkAnimal(animal)){
                System.out.println(animal);
            }
        }
    }
}


interface Check3{
     boolean checkAnimal (Animal animal);
}
