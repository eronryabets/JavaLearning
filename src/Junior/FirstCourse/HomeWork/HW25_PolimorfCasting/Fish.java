package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

public abstract  class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();

}
