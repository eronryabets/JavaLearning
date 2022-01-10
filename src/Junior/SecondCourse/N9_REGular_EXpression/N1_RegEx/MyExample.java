package Junior.SecondCourse.N9_REGular_EXpression.N1_RegEx;

/*
Задача была в следующем, в FTP логах отсечь не нужного пользователя "speed", но оставить инфу по другим пользователям.
В реальности был лоигн ИП камер, которые постоянно занимали 99% логов FTP, и было не удобно проверять инфу по другим
пользователям FTP.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyExample {
    public static void main(String[] args) {
        List<String> textList = new ArrayList<>();
        List<String> sorted = new ArrayList<>();
        textList.add("2021-12-29 00:02:11 connected 21 USER speed 331");
        textList.add("2021-12-29 06:52:34 connected USER speedy ");
        textList.add("2021-12-29 06:57:11 connected USER speaker");
        textList.add("2021-12-29 06:57:11 connected USER Nata");
        textList.add("2021-12-29 06:59:53  SERVER\\Nata  PASV ");
        textList.add("2021-12-29 07:35:45 connected USER Irina ");
        textList.add("2021-12-29 00:02:11 SERVER\\speed  PWD ");
        textList.add("2021-12-29 00:02:11 connected USER speed 331");
        textList.add("2021-12-29 07:35:45 connected USER speed777 ");

        Pattern pattern1 = Pattern.compile("USER (?!speed )");
        textList.forEach(x -> {
            Matcher matcher = pattern1.matcher(x);
            while (matcher.find()) {
                sorted.add(x);
            }
        });
        sorted.forEach(System.out::println);

        //вариант без регулярных выражений :
        List<String> sorted2 = new ArrayList<>();
        textList.forEach(x -> {
            if(x.contains("USER")){
                if(!x.contains("speed ")){
                    sorted2.add(x);
                }
            }
        });
    }
}
