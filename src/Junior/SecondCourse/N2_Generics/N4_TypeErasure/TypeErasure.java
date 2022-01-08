package Junior.SecondCourse.N2_Generics.N4_TypeErasure;

public class TypeErasure {
    public static void main(String[] args) {

    }

//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        int i = info.getValue();
//    }
    //abc(Info info)
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

class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
}
