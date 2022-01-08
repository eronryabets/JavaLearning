package Junior.FirstCourse.Lections.Less31Generic;

import static Junior.FirstCourse.Lections.Less31Generic.Main.checkIsType;

public class Box <T>{
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box integerBox = new Box();
        Box stringBox = new Box();
        Box doubleBox = new Box();

        integerBox.add(10); //integerBox.add(new Integer(10));
        stringBox.add(("Привет Мир")); // stringBox.add(new String("Привет Мир"));
        doubleBox.add(36.6);

        System.out.printf("Значение Integer :%s\n\n", integerBox.get());
        System.out.printf("Значение String :%s\n", stringBox.get());
        System.out.printf("Значение Double :%s\n", doubleBox.get());
        System.out.println("--------------------------");

        checkIsType(integerBox.get());
        checkIsType(stringBox.get());
        checkIsType(doubleBox.get());

    }

    public static <T> void myTest(Box<T> box){
        T s = box.get();
    }
}