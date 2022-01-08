package Junior.SecondCourse.N8_IO_NIO.N10_Channel_Buffer_read_from_File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        String filePath = "E:\\Logs\\IO\\test10.txt";
        try(RandomAccessFile file =
                    new RandomAccessFile(filePath,"rw");
            FileChannel channel = file.getChannel()){
            //1)создали буфер (25 бай
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();
            //2)первый раз прочитали информацию из файла в буфер
            //2)читая инфу из файла - мы записываем в буфер
            int byteRead = channel.read(buffer);
            //3)проверили, кол-во прочитаных байт > 0 ?
           //8)проверили, удалось записать в буфер? если да то repeat
            while (byteRead > 0){
                System.out.println("Read " + byteRead);
                //4)переводим буфер в режим Read
                buffer.flip();
                //5)читаем инфу из буфера и присоединяем в стрингБилдер
                while (buffer.hasRemaining()){
                  stih.append((char)buffer.get());
                }
                //6)переводим позицию на 0 ую ячейку
                buffer.clear();
                //7)опять читаем инфу из файла и пишем в буфер
                byteRead = channel.read(buffer);
            }
            System.out.println(stih);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
