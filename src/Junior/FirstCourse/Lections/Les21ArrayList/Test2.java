package Junior.FirstCourse.Lections.Les21ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Bye");
        StringBuilder sb3 = new StringBuilder("Ok");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for(StringBuilder s: list){
            System.out.println(s);
        }
        for(int i = 0; i < list.size(); i++){
            list.get(i).append("!!!!");
        }
        for(StringBuilder s: list){
            System.out.println(s);
        }
        list.remove(2);
        for(StringBuilder s: list){
            System.out.println(s);
        }
    }
}
