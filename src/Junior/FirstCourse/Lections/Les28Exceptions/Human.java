package Junior.FirstCourse.Lections.Les28Exceptions;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) throws Exception {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0){
            throw new Exception("wrong age!");
        }
        this.age = age;
    }

    public static void main(String[] args) throws Exception {
        Human h1 = new Human("Vasiliy",22);
    }

}
