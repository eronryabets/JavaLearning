package Junior.SecondCourse.N9_REGular_EXpression.N3_IP_Checker;

import java.util.regex.Pattern;

public class IpChecker {
    public static void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        //25[0-5]       |     2[0-4]\d       |       [01]?\d?\d       (\.)
        // 250-255      |     200 -249       |       0-199
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
       // 0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        checkIP(ip1);
        checkIP(ip2);

    }
}

/*
25[0-5]       |  or    2[0-4]\d      |  or   [01]?\d?\d       (\.)
25[0-5] - от 250 до 255
2[0-4]\d - 2 и от 0 до 4 и далее любая цифра от 0 до 9и
[01]?\d?\d - [0 или 1] ? может быть а может и не быть. d? любая цифра от 0 до 9 может быть а может и не быть.d - какая то цифра.

(25[0-5]|2[0-4]\d|[01]?\d?\d) - в конце делаем тоже самое, просто не ставим точку.


 */

