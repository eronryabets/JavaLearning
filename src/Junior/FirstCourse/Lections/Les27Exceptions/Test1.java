package Junior.FirstCourse.Lections.Les27Exceptions;

public class Test1 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        try {
            System.out.println(array[7]);
            System.out.println("Доступ к седьмому элементу");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение : " + e);
        }
    }
}
