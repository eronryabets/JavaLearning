package Junior.SecondCourse.N8_IO_NIO.N11_Channel_Buffer_write_to_File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channel_BufferEx2_Write {
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
            //LESSON 2 - WRITE to FILE
                String text = "\nThere are only two ways to live your life."+
                        "\nOne is as though nothing is a miracle. The other is as"+
                        "\nthough everything is a miracle.";
                //1й Вариант:
                //создадим для записи новый buffer. а chanel будет преждний
//                ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//                buffer2.put(text.getBytes());
//                buffer2.flip();
//                channel.write(buffer2);
            //2й Вариант: более элегантный
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
