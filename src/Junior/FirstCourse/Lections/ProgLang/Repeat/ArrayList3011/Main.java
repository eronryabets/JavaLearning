package Junior.FirstCourse.Lections.ProgLang.Repeat.ArrayList3011;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Subaru forester = new Subaru("Forester",240,180);
        Subaru impreza = new Subaru("Impreza",210,135);
        Subaru wrx = new Subaru("Wrx",280,300);

        ArrayList<Subaru> listSubaru = new ArrayList<>();
        System.out.println("Изначальный размер al: " + listSubaru.size());
        listSubaru.add(forester);
        listSubaru.add(impreza);
        listSubaru.add(wrx);
//        System.out.println("Размер al: " + listSubaru.size());
//        System.out.println("Содержимое al: " + listSubaru);
//        System.out.println(listSubaru.contains(wrx));
//        System.out.println(listSubaru.get(0));


    }
}
