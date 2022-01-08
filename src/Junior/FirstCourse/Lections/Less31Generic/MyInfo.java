package Junior.FirstCourse.Lections.Less31Generic;

public class MyInfo<T> {
    private T value;

    public MyInfo(T value) {
        this.value = value;
    }

    public MyInfo() {
    }

    public void add(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Iinfo{" +
                "value=" + value +
                '}';
    }
}
