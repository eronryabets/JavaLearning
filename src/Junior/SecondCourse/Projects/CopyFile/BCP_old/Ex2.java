package Junior.SecondCourse.Projects.CopyFile.BCP_old;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
//папка А и В ( с файлами) , переместить содержимое А папки в В
//копируем содержимое папки В в В2, затем удаляем папку В
//переносим содержимое папки А в новосозданную папку В
//переносим содержимое папки В2 в папку В
//удаляем папку В2


public class Ex2 {
    public static void main(String[] args) throws IOException {
        Path sourceB = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Path destinationB2 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B2");
        //копируем содержимое папки В в В2
        Files.walkFileTree(sourceB, new MyCopyFile(sourceB,destinationB2));
        //удаляем папку В
        Path bDelete = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Files.walkFileTree(bDelete, new MyDeleteFile());
        //переносим содержимое папки А в новосозданную папку В
        Path sourceA = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
        Path destinationA = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Files.walkFileTree(sourceA, new MyCopyFile(sourceA, destinationA));
        //переносим содержимое папки В2 в папку В - не можем ((
//        Files.walkFileTree(destinationB2 , new MyCopyFile(destinationB2, sourceB)); //не пашет! не раскоментировать!
        //копируем содержимое В2 в папку В
        Path file1 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B2\\testB.txt"); //testB
        Path dir2 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Files.copy(file1,dir2.resolve("testB.txt"));
//        System.out.println(dir2.resolve("testB.txt"));
        //удаляем папку В2 c ее файлами
        Files.walkFileTree(file1.getParent(), new MyDeleteFile());
        System.out.println("Done");


    }
}
//class my Delete Files
class MyDeleteFile extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("Delete name: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        System.out.println("Delete Directory: " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }

}

class MyCopyFile extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public MyCopyFile(Path source, Path destination) {
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
        Files.copy(file,newDestination, StandardCopyOption.REPLACE_EXISTING);//добавили перезапись
        return FileVisitResult.CONTINUE;
    }

}

/*
        Path source = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
//        StringBuilder sb1 = new StringBuilder(source.toString());
//        sb1.append(2);
//        System.out.println(sb1);
//        Path destination = Paths.get(String.valueOf(sb1));
        Files.walkFileTree(source, new MyCopyFile(source,destination));
        System.out.println("Done");
        //Path destination = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        //Files.walkFileTree(source, new MyCopyFile(source,destination));
 */