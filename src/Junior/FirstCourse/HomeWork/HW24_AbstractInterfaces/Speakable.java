package Junior.FirstCourse.HomeWork.HW24_AbstractInterfaces;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
