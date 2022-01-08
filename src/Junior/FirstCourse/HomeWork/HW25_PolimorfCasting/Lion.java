package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }

    @Override
    void eat() {
        System.out.println("Лев как и любой хищник люит мясо!");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

}
