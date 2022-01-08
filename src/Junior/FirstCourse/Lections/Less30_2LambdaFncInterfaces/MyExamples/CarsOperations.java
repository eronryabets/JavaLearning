package Junior.FirstCourse.Lections.Less30_2LambdaFncInterfaces.MyExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CarsOperations {

    public static void info(Car car){
        System.out.printf("Name: %s; Use: %s; Horse Power : %.1f; Speed : %.1f;\n", car.getName(), car.getUse(), car.getHorsePower(), car.getSpeed());
    }

    public static void filtrationCars (ArrayList <Car> list, Predicate<Car> predicate){
        int count = 0;
        for(Car car : list){
            if(predicate.test(car)){
                info(car);
                count++;
            }
        }
        System.out.printf("Для данного фильтра совпало %d cars. \n" ,count);
    }

}
