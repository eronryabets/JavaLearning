package Junior.SecondCourse.N2_Generics.N2_ParameterizedClass;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("MyText");
        Info<Integer> info2 = new Info<>(13);
        System.out.println(info1);

    }

}

class Info<T>{
    private T value;

    public Info(T value) {
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
        return "Info{" +
                "value=" + value +
                '}';
    }
}
