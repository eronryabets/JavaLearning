package Junior.FirstCourse.Lections.ProgLang.Repeat.InnerClasses21;

public class Test1 {
    public static void main(String[] args) {
        Outer_Demo outer = new Outer_Demo();
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }


}
