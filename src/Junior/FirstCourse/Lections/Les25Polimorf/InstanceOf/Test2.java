package Junior.FirstCourse.Lections.Les25Polimorf.InstanceOf;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumpable){ System.out.println("j is Jampable"); }
        if (m instanceof Man){ System.out.println("m is Man"); }
    }
}

interface Jumpable{}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
