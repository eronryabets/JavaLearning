package Junior.SecondCourse.N2_Generics.N5_Subtyping;

public class ParameterizedClass {
    public static void main(String[] args) {
       // Info<String> info1 = new Info<>("MyText");
        Info<Integer> info2 = new Info<>(13);
        System.out.println(info2);

    }

}

class Info<T extends Number>{
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

interface I1{

}
interface I2{

}