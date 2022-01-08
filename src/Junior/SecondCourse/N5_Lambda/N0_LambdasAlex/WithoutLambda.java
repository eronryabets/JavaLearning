package Junior.SecondCourse.N5_Lambda.N0_LambdasAlex;

import java.util.ArrayList;
import java.util.List;

public class WithoutLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

        print(animals, new CheckIfHopper());

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals){
            if( checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }

}
