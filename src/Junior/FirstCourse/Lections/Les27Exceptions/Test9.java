package Junior.FirstCourse.Lections.Les27Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    public static void main(String[] args) {
        try{
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        }catch (NullPointerException  e){
        System.out.println("Exception №2");
        }
        catch (FileNotFoundException e){
            System.out.println("Exception №1");
        }
//        catch (IOException e){
//            System.out.println("Exception №3");
//        }
        catch (RuntimeException e){
            System.out.println("Exception №4");
        }
        catch (Exception e){
            System.out.println("Exception №5");
        }
        catch (Throwable e){
            System.out.println("Exception №6");
        }

    }
}
