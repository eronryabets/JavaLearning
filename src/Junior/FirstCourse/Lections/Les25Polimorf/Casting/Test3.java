package Junior.FirstCourse.Lections.Les25Polimorf.Casting;

//из внутри тест 30 вызвать метод тест 20
public class Test3 {
    public static void main(String[] args) {
        Test30 t30 = new Test30();
        Test20 t20 = new Test20();
        //((Test20)t30).abc();
        t30.abc();

    }
}
class Test10{
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}

class Test30 extends Test20{
    int a = 15;
    void abc(){
        super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a); //а при t.a вывод 15 (компайл тайм бандинг)
        ((Test10)t).abc();
    }
}
