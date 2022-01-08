package Junior.FirstCourse.Lections.Les23Overriding;

public class Test1Banding {
    void testMethod(Animal a){
        System.out.println("A");
    }
    void testMethod(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test1Banding t = new Test1Banding();
        Animal an = new Mouse();
        t.testMethod(an); //A
        an.getName(); //Mouse
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
    public  void toSpeak(){
        System.out.println("Speaking Animal");
    }
}
class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }

    @Override
    public void toSpeak(){
        System.out.println("Speaking Mouse");
    }
}
