package Junior.FirstCourse.Lections.Les26StaticNonStaticInitializers;

public class Test {

    {
        System.out.println("Eto init blok 1");
        //это блок Инициалайзинг, код срабатывает всегда при создании обьекта.
        //вне зависимости от его конструктора.
    }
    public Test() {
        System.out.println("Eto konstruktor 1");
    }
    public Test(int a) {
        this();
        System.out.println("Eto konstruktor 2");
    }

    static {
        System.out.println("Eto STATIC init blok 1");
    }
    {
        System.out.println("Eto init blok 2");
    }
    static {
        System.out.println("Eto STATIC init blok 2");
    }

    public static void main(String[] args) {
        Test t = new Test(5);
    }
}
