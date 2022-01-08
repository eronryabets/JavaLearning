package Junior.FirstCourse.Lections.Les25Polimorf.Casting;

public class Test2 {
    public static void main(String[] args) {
        String[] array1 = {"Hello", "Yes"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
        //array3 [0] = new StringBuilder("ok"); //так нельзя
        //array2[0] = new StringBuilder("ok"); //компилятор пропустит, но будет рантайм эксепшн, так как массив ссылается на массив Стрингов


    }
}
