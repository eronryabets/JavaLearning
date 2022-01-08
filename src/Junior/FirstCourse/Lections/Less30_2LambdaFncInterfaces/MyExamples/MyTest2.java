package Junior.FirstCourse.Lections.Less30_2LambdaFncInterfaces.MyExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class MyTest2 {
    public static void main(String[] args) {
        CarBuilder carBuilder = Car::new;
        Car car1 = carBuilder.create("Honda","Sport",300,280);
        //info(car1);
        Car car2 = new Car("Subaru","Sport",270,270);
        Car car3 = new Car("Hyundai","Taxi",150,220);
        Car car4 = new Car("Smart","Delivery",80,140);
        Car car5 = new Car("Lada","Citizen",110,180);
        Car car6 = new Car("Ferrari","Sport",444,340);

        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5, car6));
        //Consumer<Car> printer = car-> System.out.println("car "+ car);
        //Consumer<Car> printer = car-> info(car);
        //carsList.forEach(car -> printer.accept(car));
        //carsList.forEach(CarsOperations::info); // == car -> info(car)
        //carsList.forEach(carShow -> { filtrationCars(carsList,car -> car.getName().startsWith("S"));});
        //carsList.forEach(carShow -> { filtrationCars(carsList,car -> car.getName().startsWith("S"));});
        //filtrationCars(carsList,car -> car.getName().replace('a','b'));
        String test1 = "Zaza";
        test1.replace('a','b');
        System.out.println(test1);
        //carsList.forEach(car -> car.setName(car.getName().replace('a','X')));
        carsList.forEach(car -> car.setName(car.getName().replaceAll("a","basd")));
        carsList.forEach(car -> System.out.println(car));


    }
}


