package Junior.SecondCourse.Projects.Repeat.AllRepeat;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Cloneable {
    private String model;
    private int yearsMade;
    private int horsePower;

    public Car(String model, int yearMade, int horsePower) {
        this.model = model;
        this.yearsMade = yearMade;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearsMade() {
        return yearsMade;
    }

    public void setYearsMade(int yearsMade) {
        this.yearsMade = yearsMade;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYearsMade() == car.getYearsMade() &&
                getHorsePower() == car.getHorsePower() &&
                Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getYearsMade(), getHorsePower());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearMade=" + yearsMade +
                ", horsePower=" + horsePower +
                '}';
    }

    public Car clone() throws CloneNotSupportedException {
        Car clone = (Car) super.clone();
        return clone;
    }

    public static class CarModelComparator implements Comparator<Car>{

        @Override
        public int compare(Car o1, Car o2) {
            return o1.model.compareTo(o2.model);
        }
    }
}
