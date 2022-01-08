package Junior.SecondCourse.Projects.People;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String brand;
    private String model;
    private String color;
    private String engine;
    private int horsePower;

    public Car(String brand, String model, String color, String engine, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getEngine() == car.getEngine() &&
                getHorsePower() == car.getHorsePower() &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getColor(), getEngine(), getHorsePower());
    }

    @Override
    public int compareTo(Car o) {
        return this.horsePower-o.horsePower;
    }
}
