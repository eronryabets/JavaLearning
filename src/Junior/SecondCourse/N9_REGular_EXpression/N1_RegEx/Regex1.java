package Junior.SecondCourse.N9_REGular_EXpression.N1_RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        List<String> myFind = new ArrayList<>();
        String s =
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99, PhoneNumber: +123456789;"
                + "Petrova Maria, Ukraine, Kyiv, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, PhoneNumber: +987654321;"
                +"Chuck Norris, USA, Hollywood, All stars street, 87, Flat21, " +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        //Pattern pattern1 = Pattern.compile("\\w+"); //найдем все слова
        //Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b"); //найдем номера домов (2символа)
        //Pattern pattern1 = Pattern.compile("\\+\\d{9}"); //найжем номера телефонов
        //Pattern pattern1 = Pattern.compile("\\w+@\\w+\\.(ru|com)"); //поиск @mail
        //String s1 = "poka      abc       Zaur    dom   kino abstrakcio"; //пробелы и табы
        //Pattern pattern1 = Pattern.compile("\\w\\S+\\w");
        //String s1 = "abcd abce3 abcfa78abcg6abch"; //
        //Pattern pattern1 = Pattern.compile("\\D{2,6}");
        //String s1 = "ABCABABDA"; //ищем повторение группы символов
        //Pattern pattern1 = Pattern.compile("(AB){2,3}");
        //String s1 = "DABCDABABDABABABABD"; //
        //Pattern pattern1 = Pattern.compile("D(AB){2,}");
        //String s1 = "DABCDABABDA"; //
        //Pattern pattern1 = Pattern.compile("D(AB)?");
        //String s1 = "DABCDABABDA"; //
        //Pattern pattern1 = Pattern.compile("D(AB)*");
        //String s1 = "abcd abce abcfabcgabch"; //
        //Pattern pattern1 = Pattern.compile("bch\\Z");
        String s1 = "abcd abcd4 afc4ced7"; //
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");



        Matcher matcher = pattern1.matcher(s1);
        while(matcher.find()){
            //System.out.println(matcher.group());
            myFind.add(matcher.group());
        }
        System.out.println(myFind);
    }
}
