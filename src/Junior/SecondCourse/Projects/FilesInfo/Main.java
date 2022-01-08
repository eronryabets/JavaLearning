package Junior.SecondCourse.Projects.FilesInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
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
            file.writeBytes(files.length -1 + " - files in this directory. (without \"foldersInfo\")" + "\n");
            for(File f:files){
                if(String.valueOf(f).contains("foldersInfo.txt") == false){
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
