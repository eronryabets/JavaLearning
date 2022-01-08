package Junior.SecondCourse.Projects.FilesInfo;

/*
v1
задание на самопроверку - написать скрипт который выводит список всех файлов в директории
Запись в текстовый файл foldersInfo.txt //folder.ListFiles() - путь папки самой
//Закрытие окна через 5 секунд
Сделать подсчет только файлов ( а не файлов и папок)
v1.1 - сделать
( добавить вариант фильтра по расширению).
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Run {
    public static void main(String[] args) {
        String folderInfoName = "foldersInfo.txt"; //name
        File foldersInfo = new File(folderInfoName); //create file
        //теперь через путь созданного файла .getAbsolutePath() отнимим его название и получим нашу директорию
        StringBuilder sb = new StringBuilder(foldersInfo.getAbsolutePath());
        sb.delete(sb.length() - folderInfoName.length(),sb.length());
        File folder = new File(String.valueOf(sb)); //присоим путь нашей директории в которой мы находимся
        File[] files = folder.listFiles(File::isFile);
        File[] directories = folder.listFiles(File::isDirectory);
        //запись кол-ва файлов в этой директории в файл foldersInfo.txt
        try(RandomAccessFile file = new RandomAccessFile(foldersInfo,"rw")){
            //вычтем из расчета -2 файла jar и txt "foldersInfo"
            file.writeBytes("FILES : " + "\n");
            file.writeBytes(files.length -2 + " - files in this directory. (without \"foldersInfo\")" + "\n");
            for(File f:files){
                if(String.valueOf(f).contains("foldersInfo") == false){
                    file.writeBytes(f + "\n");
                }
            }
            file.writeBytes("---------------------------------------- " + "\n");
            file.writeBytes("DIRECTORIES : " + "\n");
            file.writeBytes(directories.length + " - directories in this directory." + "\n");
            for(File f:directories){
                file.writeBytes(f + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
BCP
public class Run {
    public static void main(String[] args) {
        String folderInfoName = "foldersInfo.txt"; //name
        File foldersInfo = new File(folderInfoName); //create file
        //теперь через путь созданного файла .getAbsolutePath() отнимим его название и получим нашу директорию
        StringBuilder sb = new StringBuilder(foldersInfo.getAbsolutePath());
        sb.delete(sb.length() - folderInfoName.length(),sb.length());
        File folder = new File(String.valueOf(sb)); //присоим путь нашей директории в которой мы находимся
        File[] files = folder.listFiles(File::isFile);
        File[] directories = folder.listFiles(File::isDirectory);
        //запись кол-ва файлов в этой директории в файл foldersInfo.txt
        try(RandomAccessFile file = new RandomAccessFile(foldersInfo,"rw")){
            file.writeBytes("FILES : " + "\n");
            file.writeBytes(files.length - 1 + " - files in this directory. (without \"foldersInfo\")" + "\n");
            for(File f:files){
                file.writeBytes(String.valueOf(f) + "\n");
            }
            file.writeBytes("---------------------------------------- " + "\n");
            file.writeBytes("DIRECTORIES : " + "\n");
            file.writeBytes(directories.length + " - directories in this directory." + "\n");
            for(File f:directories){
                file.writeBytes(String.valueOf(f) + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //закрытие окна через 5 секунд.
//        try {
//            Thread.sleep(1000);
//            System.out.print("Закрытие программы через : 5");
//            Thread.sleep(1000);
//            System.out.print(" 4");
//            Thread.sleep(1000);
//            System.out.print(" 3");
//            Thread.sleep(1000);
//            System.out.print(" 2");
//            Thread.sleep(1000);
//            System.out.print(" 1");
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
 */