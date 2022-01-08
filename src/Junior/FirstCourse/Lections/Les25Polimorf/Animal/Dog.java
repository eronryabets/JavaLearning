package Junior.FirstCourse.Lections.Les25Polimorf.Animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void voice (){
        System.out.println("Voice - from Dog");
    }

    public  void bark(){
        System.out.println("Waf waf....arrrrrr! - from Dog");
    }
    public void eat(){
        System.out.println("Dog is eating - from Dog");
    }

}
