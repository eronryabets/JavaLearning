package Junior.SecondCourse.Projects.Repeat.LogFilter;
/*
Записывает в логи выборочно одного пользователя
FTP logins:
Ksenia
Aleksandra
Galina
Irina
Nata
Marina
Olga
Natalia
Denis
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogFilterOneName {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\Work\\Logs\\log.log"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Work\\Logs\\logOneName.txt"));
        ) {
            String line;
            while((line = reader.readLine())!=null){
                Pattern pattern = Pattern.compile("USER Natalia");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.write(line);
                    writer.write("\n");
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
