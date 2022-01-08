package Junior.FirstCourse.HomeWork.HW24_AbstractInterfaces;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}
