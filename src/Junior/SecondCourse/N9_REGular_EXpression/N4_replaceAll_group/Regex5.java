package Junior.SecondCourse.N9_REGular_EXpression.N4_replaceAll_group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String myString = "12345678912345670325987;\n" +
                "98765432165498750921654;\n" +
                "85274196345612381122333\n";
        //03/25 1234 5678 9123 4567 (987) - сделаем вывод таким форматом.
        //Year: 03/25 Number: 1234 5678 9123 4567  CVV: (987) - сделаем вывод таким форматом.
        //при помощи replace этого не сделать. Тут нам поможет regex
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);
//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);
        while(matcher.find()){
            System.out.println(matcher.group(7));
        }


    }
}

/*
(\\d{4}) - сначала 4е числа по 4 е символа.
(\\d{4}) (\\d{4}) (\\d{4}) (\\d{4})  - 4е раза повторяй так
(\\d{2}) - потом две цифры ( месяц)
(\\d{3}) - 3 это CVV

 */