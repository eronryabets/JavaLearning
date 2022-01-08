package Junior.FirstCourse.HomeWork.HW25_PolimorfCasting;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
