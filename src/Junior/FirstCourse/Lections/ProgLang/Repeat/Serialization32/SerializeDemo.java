package Junior.FirstCourse.Lections.ProgLang.Repeat.Serialization32;

import java.io.*;
public class SerializeDemo {

    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Анастасия Крот";
        e.address = "Москва, Россия";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("E:/Programming/serialization/" + e.name + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Сериализованные данные сохраняются в E:/Programming/serialization/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}