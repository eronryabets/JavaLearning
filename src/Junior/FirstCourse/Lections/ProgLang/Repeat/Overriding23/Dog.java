package Junior.FirstCourse.Lections.ProgLang.Repeat.Overriding23;

public class Dog extends Animal{
    private int angry;
    public Dog(String name, int age, int angry) {
        super(name, age);
        setAngry(angry);
    }

    public int getAngry() {
        return angry;
    }

    public void setAngry(int angry) {
        if(angry > 0){
            this.angry = angry;
        }
    }

    //да, переопределить (override) мы не можем, а только повторно обьявить.
    public static void whereIsAnimal(){
        System.out.println("Where is animal? [from class Dog]");
    }

    public  void gav(){
        super.voice();
        System.out.println("This is from Dog! -_-");

    }

    @Override
    public void voice(){
        System.out.println("I am here! [from class Dog]");
    }

}
