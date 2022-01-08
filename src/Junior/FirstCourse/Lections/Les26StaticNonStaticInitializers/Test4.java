package Junior.FirstCourse.Lections.Les26StaticNonStaticInitializers;

public class Test4 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal{
    int a = 5;
    static int b = 10;
    void abc(){ System.out.println("Non-static method from Animal"); }
    static void def(){ System.out.println("Static method from Animal"); }
}

class Tiger extends Animal{
    int a = 15; //хайдитися
    static int b = 20; //хайдитися
    void abc(){ System.out.println("Non-static method from Tiger"); }  //оверайдится
    static void def(){ System.out.println("Static method from Tiger"); } //хайдитися
}
/*
5-10-(Хайдятся)-Tg(оверайдится)-An(Статик-рантайм)
переменный будут из класса Animal , так как Ан - относится к Анимал.
Метод abc() определяется рантаймом из класса Тайгер
( потому что Ан на самом деле ссылается на класс Тайгер)
Метод df() является статическим, поэтому компайлтайм может определить
 что он будет вызыватся из класса Анимал
потому что Ан типа Анимал
 */