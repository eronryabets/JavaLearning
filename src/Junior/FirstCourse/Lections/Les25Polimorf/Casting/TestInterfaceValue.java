package Junior.FirstCourse.Lections.Les25Polimorf.Casting;

public class TestInterfaceValue implements interface1, interface2{

    @Override
    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        TestInterfaceValue t = new TestInterfaceValue();
//        System.out.println(t.a);//не можем обратиться, так как Java не знает к какой именно переменной запрос
        System.out.println(((interface2)t).a); //нужно обязательно указывать casting к какому интерфейсу запрос
        t.abc();
    }
}

interface interface1{
    int a = 5;
    void abc();
}

interface interface2{
    int a = 10;
    void abc();
}
