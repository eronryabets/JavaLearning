package Junior.SecondCourse.Projects.FtpLogFiltration;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTest {
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

        //игнорирует любую строку если после USER начинается слово на "speed"
        Pattern pattern1 = Pattern.compile("USER (?!speed )");
        textList.forEach(x -> {
            Matcher matcher = pattern1.matcher(x);
            while (matcher.find()) {
                sorted.add(x);
            }
        });
        sorted.forEach(System.out::println);

        //без regex
//        textList.forEach(x -> {
//            if(x.contains("USER")){
//                if(!x.contains("speed ")){
//                    sorted.add(x);
//                }
//            }
//        });
//        sorted.forEach(System.out::println);

    }
}


