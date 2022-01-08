package Junior.SecondCourse.N8_IO_NIO.N15_walkFileTree_copy_directory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTreeEx1 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("E:\\Logs\\IO\\X");
        Path destination = Paths.get("E:\\Logs\\IO\\CopyHere");
        Files.walkFileTree(source, new MyFileVisitor2(source,destination));
        System.out.println("Done");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    @Override
    //сначала у нас идет операция с самой папкой, а затем уже с файлами в visitFile
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        //куда мы будем копировать
        Path newDestination = destination.resolve(source.relativize(dir));
        //System.out.println(source.relativize(dir));
        //копирование папки - риплейс работает только для самой CopyHere, для вложеных папок не работает
        Files.copy(dir,newDestination, StandardCopyOption.REPLACE_EXISTING );//добавили перезапись , StandardCopyOption.REPLACE_EXISTING)
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file,newDestination);//добавили перезапись
        return FileVisitResult.CONTINUE;
    }

}
