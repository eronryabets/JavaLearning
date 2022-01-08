package Junior.FirstCourse.Lections.Les27Exceptions;

public class Test8 {
    static void abc(){
        System.out.println("Работает рекурсивный метод ABD ");
        abc();
    }

    public static void main(String[] args) {
        try{
            abc();
        }
        catch (StackOverflowError e){
            System.out.println("Поймали исключение " + e);
        }

    }
}
