package Junior.SecondCourse.N5_Lambda.N3_Supplier;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;


public class Example1 {
    public static void main(String[] args) {
        ArrayList<Car> ourCar = createThreeCars(()->
                new Car("Model X","Steel",5));
        ourCar.forEach(s-> System.out.println(s));
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i ++){
            al.add(carSupplier.get());
        }
        return al;
    }
}

class Car {
    private String model;
    private String color;
    private double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getEngine(), getEngine()) == 0 &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor(), getEngine());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}