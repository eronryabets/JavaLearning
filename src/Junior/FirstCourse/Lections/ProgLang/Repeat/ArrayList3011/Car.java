package Junior.FirstCourse.Lections.ProgLang.Repeat.ArrayList3011;

public abstract class Car {
    private String model;
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.model = name;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
