package Junior.SecondCourse.N8_IO_NIO.N9_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Logs\\IO\\test11.txt");
        File folder = new File("E:\\Logs\\IO\\TEST");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("----------------------------------------------");
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("----------------------------------------------");
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("----------------------------------------------");
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println("----------------------------------------------");
        File file2 = new File("E:\\Logs\\IO\\test12.txt");
        File folder2 = new File("E:\\Logs\\IO\\TEST2");
        file2.createNewFile();
        folder2.mkdir();
        System.out.println(file2.exists());
        System.out.println(folder2.exists());
        System.out.println("----------------------------------------------");
        System.out.println(file2.length());
        System.out.println(folder2.length());
        System.out.println("----------------------------------------------");
        file2.delete();
        folder2.delete();
        System.out.println("----------------------------------------------");
        File[] files = folder.listFiles();
        Arrays.stream(files).forEach(System.out::println);
        System.out.println("----------------------------------------------");
        System.out.println(file.isHidden());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());



    }
}
