package Junior.FirstCourse.Lections.Les26EqualsAndToString.Equals;

public class TestPolimorfCasting {
    public static void main(String[] args) {
        Animal an1 = new Dog();
        an1.eat2(an1);
        ((Dog)an1).bark();
    }
}
class Animal {
    void eat2(Animal animal){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal {

    void eat(){
        System.out.println("Dog eat");
    }
    void bark(){
        System.out.println("Wafff waf");
    }
}
