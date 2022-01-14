package Junior.SecondCourse.Projects.Repeat.LogFilter;

//Записать с ФТП логов в новый файл инфу только про подключение пользователей. (игнорировать ИП камеру "foscam")

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogFilter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\Work\\Logs\\log.log"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Work\\Logs\\logAfterSort.txt"));
        ) {
            String line;
            while((line = reader.readLine())!=null){
                Pattern pattern = Pattern.compile("USER (?!foscam )");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.write(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
