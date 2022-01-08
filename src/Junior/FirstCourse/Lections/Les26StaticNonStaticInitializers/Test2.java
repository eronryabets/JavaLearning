package Junior.FirstCourse.Lections.Les26StaticNonStaticInitializers;

public class Test2 {
    int a = 3;

    public Test2() {
       a = 4;
    }

    {
        a = 5;
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.a); //4
    }

}
