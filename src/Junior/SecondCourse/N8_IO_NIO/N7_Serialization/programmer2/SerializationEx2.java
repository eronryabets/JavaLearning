package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.programmer2;

import Junior.SecondCourse.N8_IO_NIO.N7_Serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("E:\\Logs\\IO\\employees2.bin"))
                ){
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
