package Junior.FirstCourse.HomeWork.HW16_String;

/*
"ya@yahoo.com; on@mail.ru; ona@gmail.com;"
yahoo
mail
gmail
 */

public class TestString {
    static void checkEmail(String s){
        int a = 0; //позиция символа @
        int b = 0; //позиция символа .
        int c = 0; //позиция символа ;
        while (c < s.length() -1 ){
            a = s.indexOf('@', c); // indexOf находит индекс первого вхождения подстроки в строку/ c C - с этого индекча начинаем поиск
            b = s.indexOf('.',c);
            c = s.indexOf(';',c+1);
            System.out.println(s.substring(a + 1, b));
            //substring возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        }

    }

    public static void main(String[] args) {
        checkEmail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}

/*
        int a = 0; //позиция символа @
        int b = 0; //позиция символа .
        int c = 0; //позиция символа ;

        String s1 = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        System.out.println(s1.length());
        char a1 = s1.charAt(4);
        //System.out.println(a1);
        a = s1.indexOf('@');
        b = s1.indexOf('.');
        c = s1.indexOf(';');
        System.out.println(a + "; " + b + "; " + c + "; ");
        System.out.println(s1.substring((a+1),8));
 */