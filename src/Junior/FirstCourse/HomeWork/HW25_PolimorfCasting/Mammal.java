package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

public abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }
    public abstract void run();
}
