package Junior.SecondCourse.N6_Streams.Optional;

import java.util.Optional;

public class Ex3 {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey",null);
        String email = sergey.getEmail()
                .map(String::toLowerCase)
                .orElse("Sergey didn't have @mail");


    }
}

class Person{
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

/*
     Person sergey = new Person("Sergey","serg@mail.com");
        System.out.println(sergey.getEmail()
                .map(String::toLowerCase)
                .orElse("Sergey didn't have @mail"));

 */