package Junior.FirstCourse.Lections.Les25Polimorf.Animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public  void voice (){
        System.out.println("voice - from Animal");
    }
    public void eat(){
        System.out.println("Animal is eating - from Animal");
    }
}
