package Junior.SecondCourse.Projects.CopyFile.BCP_old;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
/*
Получаеться, что при копировании X в CopyHere - если папка CH ( сокращенно от CopyHere) уже есть, ( но пустая) он ее
        удалит, и скопирует Х переименовав в CH. Но если в ней есть хотя бы один файл - значит папка не пустая, и удалить ее не
        выйдет. Нужно писать доп код.
        Задача - реализовать копирование и переименование папки "1" в папку "2".
        Если папка "2" уже создана, значит нужно скопировать туда файлы.
        Если такие же файлы уже есть - заменить новыми файлами ( старые удалить - новые вместо них вставить)
        ВАЖНО (!) Так же в папке "2" (которая существует) будут новые файлы,
        которых нет в папке "1" их нужно оставить невредимыми.
        ====
        Если такая папка существует - то просто переименовываем ее НА ХКЙ БЛЯТЬ.
        Запускаем копирования (и типа создаеться новая папка), потом из переименованной папки -
        будем копировать файлы в ноую, которых там нет. Проверили - есть такой файл в новой? нет? - копировать.
        есть там такой файл - тогда на хуй иди. По завершению этого говно скрипта - удаляем эту переименованную
        папку к хуям прямиком в АД НА Х У Й ...аааа сука, ебала меня джава...

 */

public class CopyWithReplaceFile {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("E:\\Logs\\IO\\CopyTEST\\1");
        Path destination = Paths.get("E:\\Logs\\IO\\CopyTEST\\2");
        //Files.walkFileTree(source, new MyFileVisitor2(source,destination));
        Path file1 = Paths.get("E:\\Logs\\IO\\CopyTEST\\A\\test1.txt");
        Path dir2 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        //Files.copy(file1,dir2.resolve("test2.txt"), StandardCopyOption.REPLACE_EXISTING);
        //Files.exists(dir2);
        System.out.println(Files.exists(dir2));
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
    //1) Копирование папок
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        //System.out.println(newDestination.toAbsolutePath());
        //System.out.println(Files.isSameFile(dir,newDestination));
        //Files.copy(dir,newDestination,StandardCopyOption.REPLACE_EXISTING );
        return FileVisitResult.CONTINUE;
    }

    @Override
    //2) Затем копирование файлов в папки
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
       // Files.copy(file,newDestination, StandardCopyOption.REPLACE_EXISTING);//добавили перезапись
        return FileVisitResult.CONTINUE;
    }

}

/*
Получаеться, что при копировании X в CopyHere - если папка CH ( сокращенно от CopyHere) уже есть, ( но пустая) он ее
удалит, и скопирует Х переименовав в CH. Но если в ней есть хотя бы один файл - значит папка не пустая, и удалить ее не
выйдет. Нужно писать доп код.
Задача - реализовать копирование и переименование папки "1" в папку "2".
Если папка "2" уже создана, значит нужно скопировать туда файлы.
Если такие же файлы уже есть - заменить новыми файлами ( старые удалить - новые вместо них вставить)
ВАЖНО (!) Так же в папке "2" (которая существует) будут новые файлы,
которых нет в папке "1" их нужно оставить невредимыми.
=====
        Path dir1 = Paths.get("E:\\Logs\\IO\\CopyTEST\\A");
        Path dir2 = Paths.get("E:\\Logs\\IO\\CopyTEST\\B");
        Path file1 = Paths.get("E:\\Logs\\IO\\CopyTEST\\A\\test1.txt");
        //Files.copy(dir1,dir2, StandardCopyOption.REPLACE_EXISTING);
        //Files.copy(file1,dir2.resolve("test1.txt"));
        //System.out.println(file1 + " " + dir2.resolve("test1.txt"));
        Files.copy(dir1,dir2, StandardCopyOption.REPLACE_EXISTING);
        ======================
 @Override
    //сначала у нас идет операция с самой папкой, а затем уже с файлами в visitFile
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        //куда мы будем копировать
        Path newDestination = destination.resolve(source.relativize(dir));
        ///System.out.println(source.relativize(dir));
        //копирование папки - риплейс работает только для самой CopyHere, для вложеных папок не работает
        //EPLACE_EXISTING - удаляет, и заменяет другой которой копирует, но если папка не пуста ее он не удалит
        //добавили перезапись , StandardCopyOption.REPLACE_EXISTING)
        //значит нужно что бы скрипт проверял, пуста ли папка? если не пуста - то что делать?
        // - копировать файлы в нее, заменяя  уже существующие, но оставляя те которых у нас нет в копировании
        Files.copy(dir,newDestination,StandardCopyOption.REPLACE_EXISTING );
        //System.out.println("relativize(dir) : " + "|" + source.relativize(dir) + "|" + " copy FROM dir -> " + dir + " TO newDestination = " + newDestination );
        return FileVisitResult.CONTINUE;
    }
 */