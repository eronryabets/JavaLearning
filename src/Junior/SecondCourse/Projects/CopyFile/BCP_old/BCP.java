package Junior.SecondCourse.Projects.CopyFile.BCP_old;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
/*
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Path myA = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
        Path myB = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        StringBuilder sb2 = new StringBuilder(myB.toString());
        sb2.append(2);
        Path myB2 = Paths.get(String.valueOf(sb2));
        //Переименовываем В в В2
        Files.walkFileTree(myB, new RenameFolder(myB,myB2));
        //Переименовываем А в В
        Files.walkFileTree(myA, new RenameFolder(myA,myB));
        //Перемещаем файлы с В2 в папку В
        //ошибка если такой файл уже есть в другой директории
        //не перемещает папку
        //нам нужно скипнуть перемещение самой B2 , но ПЕРЕМЕСТИТЬ myB
       Files.walkFileTree(myB2,new MoveFile(myB2,myB));


    }
}

//class my Delete Files
class DeleteFile extends SimpleFileVisitor<Path> {
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

class CopyFile extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public CopyFile(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    @Override
    //сначала у нас идет операция с самой папкой, а затем уже с файлами в visitFile
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        //куда мы будем копировать
        Path newDestination = destination.resolve(source.relativize(dir));
        //Files.copy(dir,newDestination, StandardCopyOption.REPLACE_EXISTING );//добавили перезапись , StandardCopyOption.REPLACE_EXISTING)
        Files.move(dir,newDestination);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        //Files.copy(file,newDestination, StandardCopyOption.REPLACE_EXISTING);//добавили перезапись
        return FileVisitResult.CONTINUE;
    }

}

class RenameFolder extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public RenameFolder(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.move(dir,newDestination);
        return FileVisitResult.SKIP_SIBLINGS; // в данной директории продолжать обход по файлам не нужно
    }
}

class MoveFile extends SimpleFileVisitor<Path> {
    Path source; //FROM ->
    Path destination; //-> TO

    public MoveFile(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        //System.out.println("source - " + source);
        //System.out.println("destination - " + destination);
        if(dir == source){
            //System.out.println("скипнули " + dir);;
        } else {
            Files.move(dir,newDestination);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        //нужно проверить есть ли в destination файл с таким именем? есть - скип
        Path destinationCheck = Paths.get(destination.toString() + "\\" + file.getFileName());

//        System.out.println("destinationCheck = " + destinationCheck);
//        System.out.println("source = " + source);
//        System.out.println("destination = " + destination);

        //нам нужно выяснить есть ли файл из source в destination
        if(Files.exists(newDestination)){ //Files.exists(destinationCheck)
            System.out.println("скипнули " + file);;
        } else {
            System.out.println("Перекидываем " + file + " в " + " newDestination = " + newDestination );
            Files.move(file,newDestination);
        }
        return FileVisitResult.CONTINUE;
    }
}



*/