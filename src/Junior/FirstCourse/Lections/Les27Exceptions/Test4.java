package Junior.FirstCourse.Lections.Les27Exceptions;

public class Test4 {
    public static void main(String[] args) {
        int array [] = {1,2,3};
        System.out.println("У нас есть массив");
        try{
            System.out.println(array[5]);
            System.out.println("Всем хорошего дня");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Было пойманно исключение - " + e);
        }
        finally {
            System.out.println("Это блок finally");
        }
        System.out.println("Данный код уже не имеет отношение к исключениям");

    }
}
