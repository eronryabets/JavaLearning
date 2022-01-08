package Junior.SecondCourse.N9_REGular_EXpression.N1_RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "ABCOPAB7OP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(i|5)");
//        String s1 = "abcd abce dsf";
//        Pattern pattern1 = Pattern.compile("sf$");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");
//        String s1 = "abcd!?abce====abc ++5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+");
        String s1 = "poka abc Zaur dom kino dooms abstrakcionizm";
        Pattern pattern1 = Pattern.compile("\\w{4}");

        Matcher matcher = pattern1.matcher(s1);
        while(matcher.find()){
            System.out.println("Position: " + matcher.start() + " - " + matcher.group());

        }

    }
}
