package Junior.SecondCourse.Projects.Repeat.MyINterfaces;

public class Human implements Speakable{

    public void speak(){
        System.out.println("I am a Human! and my name is " + this.name);
    }

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
