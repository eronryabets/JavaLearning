package Junior.SecondCourse.N6_Streams.Optional;

import java.util.Optional;

public class Ex2 {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable("Hello"); //("hello")
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello
                .map(String::toUpperCase) //если Optional не пустой - применим Аппер Кейс
                //.orElse("World");//если будет пусто - заменит на "World"
//                .orElseGet(()-> {
//                    //todo some logic
//                    return "world"; });
                .orElseThrow(IllegalAccessError::new); //создает исключение

        hello.ifPresent(System.out::println);

        hello.ifPresentOrElse(System.out::println, ()-> {
            System.out.println("world");
        });



    }
}
