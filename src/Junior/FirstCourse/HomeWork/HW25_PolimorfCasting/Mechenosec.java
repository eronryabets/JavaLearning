package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

public class Mechenosec extends Fish {
    public Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }

    @Override
    void eat() {
        System.out.println("Меченосец рыба не хищная и она ест обычный корм для рыб");
    }
}
