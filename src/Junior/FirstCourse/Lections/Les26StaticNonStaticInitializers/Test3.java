package Junior.FirstCourse.Lections.Les26StaticNonStaticInitializers;

public class Test3 {
    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println("l2 create : ");
        Lion l2 = new Lion();
    }
}

class Animal2{
    Animal2(){ System.out.println("Constructor of Animal"); }
    static { System.out.println("Static init in Animal"); };
    { System.out.println("NonStatic init in Animal"); }
}

class Mammal extends Animal2{
    Mammal(){ System.out.println("Constructor of Mammal"); }
    static { System.out.println("Static init in Mammal"); };
    { System.out.println("NonStatic init in Mammal"); }
}

class Lion extends Mammal{
    Lion(){ System.out.println("Constructor of Lion"); }
    static { System.out.println("Static init in Lion"); };
    { System.out.println("NonStatic init in Lion"); }
}