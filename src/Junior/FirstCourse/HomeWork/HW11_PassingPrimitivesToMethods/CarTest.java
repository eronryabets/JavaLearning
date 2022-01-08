package Junior.FirstCourse.HomeWork.HW11_PassingPrimitivesToMethods;

public class CarTest {

    public static void changeDoorsAmount(Car car, int amountDoors){
        car.doors = amountDoors;
    }

    public static void swapCars(Car car1, Car car2){
        Car car3 = new Car();
        car3.engine = car1.engine;
        car3.doors = car1.doors;
        car3.color = car1.color;
        car1.engine = car2.engine;
        car1.doors = car2.doors;
        car1.color = car2.color;
        car2.engine = car3.engine;
        car2.doors = car3.doors;
        car2.color = car3.color;
    }

    public static void swapColor(Car car1, Car car2){
        Car car3 = new Car();
        car3.color = car1.color;
        car1.color = car2.color;
        car2.color = car3.color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Black","v8",4);
        Car car2 = new Car("White","v6",2);
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        swapCars(car1,car2);
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
    }

}
