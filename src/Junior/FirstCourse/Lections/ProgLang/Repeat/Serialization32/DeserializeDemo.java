package Junior.FirstCourse.Lections.ProgLang.Repeat.Serialization32;

import java.io.*;
public class DeserializeDemo {

    public static void main(String [] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("E:/Programming/serialization/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Класс Employee не найден");
            c.printStackTrace();
            return;
        }

        System.out.println("Десериализованный Employee...");
        System.out.println("Имя: " + e.name);
        System.out.println("Адрес: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Номер: " + e.number);
    }
}