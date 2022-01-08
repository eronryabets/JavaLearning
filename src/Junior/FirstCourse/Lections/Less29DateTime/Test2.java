package Junior.FirstCourse.Lections.Less29DateTime;

//import static JavaJun.FirstCourse.Lections.Less29DateTime.Car.createCar;

public class Test2 {
    public static void main(String[] args) {
        // createCar();
        Car c = Car.createCar();
    }
}

class Car {
    private Car() {

    }

    static Car createCar() {
        return new Car();
    }
}
