package Junior.SecondCourse.N5_Lambda.N1_Lambda;

public class LambdaEx2 {
    static void printText(I i){
        System.out.println(i.abc("Hello!"));
    }

    public static void main(String[] args) {
        printText((String s)-> {return s.length();});
        //printText(String::length);
    }
}

interface I {
    int abc (String s);
}
