package Junior.FirstCourse.Lections.Less30_2LambdaFncInterfaces.MyExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Supplier;

public class MyTest {

    public static void main(String[] args) {

        Supplier<User> userFactory = ()->{

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите имя: ");
            String name = null;
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }
}

class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}