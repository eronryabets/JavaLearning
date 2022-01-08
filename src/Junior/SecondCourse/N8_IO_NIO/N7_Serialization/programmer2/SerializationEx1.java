package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees;
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("E:\\Logs\\IO\\employees1.bin")
        )
                ){
            //сохраняет обьекты, используем кастинг для стринга
           employees = (ArrayList)inputStream.readObject();
            System.out.println(employees);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
