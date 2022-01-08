package Junior.FirstCourse.Lections.Les25Polimorf.PrimitiveDTcasting;

public class Test1 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //теперь у нас b не байт а инт.

        int i = 5;
        long l = 10;
        //сначала i кастится в лонг, и уже потом лонг + лонг.
        System.out.println(i+l);
    }
}
