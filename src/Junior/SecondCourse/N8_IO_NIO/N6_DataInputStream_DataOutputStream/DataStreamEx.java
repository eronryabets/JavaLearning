package Junior.SecondCourse.N8_IO_NIO.N6_DataInputStream_DataOutputStream;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        // запись в файл:
        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("E:\\Logs\\IO\\myTest.bin"));
             // обратное считывание из файла:
             DataInputStream inputStream = new DataInputStream(
                     new FileInputStream("E:\\Logs\\IO\\myTest.bin"));
        ){
            //записываем в файл:
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(123.456);
            //считываем из файла:
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}