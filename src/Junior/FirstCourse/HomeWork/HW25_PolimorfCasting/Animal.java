package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();

}
