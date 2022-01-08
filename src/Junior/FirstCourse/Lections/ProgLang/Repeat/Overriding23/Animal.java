package Junior.FirstCourse.Lections.ProgLang.Repeat.Overriding23;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() > 1){
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public static void whereIsAnimal(){
        System.out.println("Where is animal? [from class Animal]");
    }
    public void voice(){
        System.out.println("I am here! [from class Animal]");
    }

}
