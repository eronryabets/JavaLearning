package Junior.SecondCourse.N8_IO_NIO.N7_Serialization.programmer1;


import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Model X", "white");
        Employee employee = new Employee("Maria","Ivanova",
                //28,
                "IT",500,car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
              new FileOutputStream("E:\\Logs\\IO\\employees2.bin")
        )){
            outputStream.writeObject(employee);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
