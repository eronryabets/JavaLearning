package Junior.FirstCourse.HomeWork.HW17_StringBuilder;
//так как метод equals у Билдера переобределен, нам нужно сначала обьект билдера перевести в строку, а затем сравнивать.

public class TestBuilder {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean result = sb1.toString().equals(sb2.toString());
        return result;
    }
    public static boolean ravenstvo2(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if(sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length(); i++ ){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        }
        else {
            result = false;
        }
        return result;
    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("World");
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb1,sb2));
        System.out.println(ravenstvo(sb1,sb3));
        System.out.println(ravenstvo2(sb1,sb2));
        System.out.println(ravenstvo2(sb1,sb3));

    }
}
