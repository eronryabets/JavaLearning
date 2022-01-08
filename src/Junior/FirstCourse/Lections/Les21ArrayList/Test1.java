package Junior.FirstCourse.Lections.Les21ArrayList;


import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bye");
        list.add("Hello");
        list.add("Ok");
        list.add(1,"Hello");
        for (String s : list) {
            System.out.println(s + " ");
        }
        System.out.println("Get : " + list.get(0));
        list.set(0,"Hi"); //заменили Бай на Хай
        System.out.println("Get : " + list.get(0));

    }
}
