package Junior.FirstCourse.Lections.Les28Exceptions;

import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            System.out.println("Exception poiman");
        }
    }


}

class Animal2 {
    void run() throws IOException {
        System.out.println("Animals runs");
    }
}

class Mouse extends Animal2 {
    void run(){
        System.out.println("Mouse runs");
    }
}
