package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Alex");
        employees.add("Egor");
        employees.add("Ivan");
        employees.add("Elena");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("E:\\Logs\\IO\\employees1.bin")
        )){
            objectOutputStream.writeObject(employees);
            System.out.println("Done");;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
