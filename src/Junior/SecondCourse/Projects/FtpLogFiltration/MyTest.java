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
        Pattern pattern1 = Pattern.compile("USER (?!speed)"); //"USER (?!speed)"
        textList.forEach(x -> {
            Matcher matcher = pattern1.matcher(x);
            while (matcher.find()) {
                sorted.add(x);
            }
        });
        sorted.forEach(System.out::println);

    }
}


/*
        Pattern pattern1 = Pattern.compile("USER [^\bfoscam\b]"); //("USER [^\bfoscam\b]") //(.*)\foscam\b\s*(.*)
        textList.forEach(x->{
            Matcher matcher = pattern1.matcher(x);
            while(matcher.find()){
                sorted.add(x); } });
        sorted.forEach(System.out::println);
        =======================================
               Pattern pattern1 = Pattern.compile("USER"); //("USER [^\bfoscam\b]") //(.*)\foscam\b\s*(.*)
        Pattern pattern2 = Pattern.compile("foscam");

        textList.forEach(x -> {
            Matcher matcher = pattern1.matcher(x);
            while (matcher.find()) {
                if (!pattern2.matcher(x).find()) {
                    System.out.println(x);
                    sorted.add(x);
                }
            }
        });
        ======================
        System.out.println("===============================");
        List<String> sorted2 = new ArrayList<>();
        Pattern pattern2 = Pattern.compile("USER");
        Pattern pattern3 = Pattern.compile("foscim");

        textList.forEach(x -> {
            Matcher matcher1 = pattern2.matcher(x);
            while (matcher1.find()) {
                Matcher matcher2 = pattern3.matcher(x);
                if(!matcher2.find()){
                    sorted2.add(x);
                }
            }
        });
        sorted2.forEach(System.out::println);

 */