package Junior.FirstCourse.Projects.GasCounter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    public static void log(String message) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("E://Logs//ГазРасчеты.txt", true), true);
        out.write(message);
        out.close();
    }
}
