package Junior.FirstCourse.Lections.ProgLang.Repeat.ArrayList3011;

public class Subaru extends Car {
    private int enginePower;

    public Subaru(String name, int maxSpeed, int enginePower) {
        super(name, maxSpeed);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
