package Junior.SecondCourse.N8_IO_NIO.N12_Channel_Buffer_important_Methods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx3 {
    public static void main(String[] args) {
        String filePath = "E:\\Logs\\IO\\test5.txt";
       try(RandomAccessFile file = new RandomAccessFile(filePath,"rw");
           FileChannel channel = file.getChannel()){
           ByteBuffer buffer = ByteBuffer.allocate(5);
           channel.read(buffer); //прочитали из файла в буфер
           buffer.flip();
           System.out.println((char)buffer.get()); //a
           System.out.println((char)buffer.get()); //b
           System.out.println((char)buffer.get()); //c
           buffer.rewind();
           System.out.println((char)buffer.get()); //a

           System.out.println("-------------------");
           buffer.compact();
           channel.read(buffer);
           buffer.flip(); //перешли в reading mod
           while (buffer.hasRemaining()){
               System.out.println((char)buffer.get());
           }

           System.out.println("-------------------");
           //установим position на 0
           buffer.clear();
           //прочтем оставышиеся 4е символа
           //и запишем их в buffer
           channel.read(buffer);
           //и для перехода в Read mode
           buffer.flip();
           System.out.println((char)buffer.get());
           buffer.mark(); //h
           System.out.println((char)buffer.get());
           System.out.println((char)buffer.get());
           buffer.reset();
           while (buffer.hasRemaining()){
               System.out.println((char)buffer.get());
           }



       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
