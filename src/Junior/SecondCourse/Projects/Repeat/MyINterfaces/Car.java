package Junior.SecondCourse.Projects.Repeat.MyINterfaces;

public class Car implements Speakable{
    private String model;
    private int age;

    public Car(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
