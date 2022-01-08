package Junior.FirstCourse.HomeWork.HW30_Lambda.MyExamples;

public class Car {

    public static int counter;
    private final String name;
    private String use;
    private double horsePower;
    private double speed;

    public Car(String name, String use, double horsePower, double speed) {
        this.name = name;
        this.use = use;
        this.horsePower = horsePower;
        this.speed = speed;
        counter++;
    }



    public String getName() {
        return name;
    }

    public String getUse() {
        return use;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getSpeed() {
        return speed;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", use='" + use + '\'' +
                ", horsePower=" + horsePower +
                ", speed=" + speed +
                '}';
    }

}
