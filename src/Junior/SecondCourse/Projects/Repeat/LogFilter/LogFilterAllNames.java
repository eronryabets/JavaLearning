package Junior.SecondCourse.Projects.Repeat.LogFilter;
/*
записывает в логи группу определенных пользователей
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
//нужно что бы сначала как то записало по каждому пользователю отдельно , либо как то сортировать инфу по пользователю
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogFilterAllNames {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\Work\\Logs\\log.log"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Work\\Logs\\logAllNames.txt"));
        ) {
            String line;
            while((line = reader.readLine())!=null){
                Pattern pattern = Pattern.compile("(Ksenia|Aleksandra|Galina|Irina|Nata|Marina|Olga|Natalia|Denis)");
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

//Pattern pattern = Pattern.compile("(USER Ksenia|USER Aleksandra|USER Galina|USER Irina|USER Nata|USER Marina|USER Olga|USER Natalia)"); //only connect info