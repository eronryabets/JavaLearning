package Junior.SecondCourse.N1_Interfaces_Comporable_and_Comporator.N1_Comparable.MyExamples;

public class Car implements Cloneable{
    private String model;
    private int carYear;

    public Car(String model, int carYear) {
        this.model = model;
        this.carYear = carYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "; car old='" + carYear + '\'' +
                '}';
    }

    public Car clone() throws CloneNotSupportedException{
        return (Car) super.clone();
    }
}
