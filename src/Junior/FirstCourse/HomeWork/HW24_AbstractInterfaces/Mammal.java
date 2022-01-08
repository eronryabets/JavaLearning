package Junior.FirstCourse.HomeWork.HW24_AbstractInterfaces;

public abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }
    public abstract void run();
}
