package Junior.FirstCourse.Lections.Less31Generic;


import static jdk.nashorn.internal.runtime.JSType.isNumber;
import static jdk.nashorn.internal.runtime.JSType.isString;

public class Main {
    public static void main(String[] args) {
        MyInfo<String> info1 = new MyInfo<>("Hello");
        MyInfo info2 = new MyInfo();
        info2.add(10);

        String st = "her";
        int nm = 6;
//        System.out.println(isString(st));
//        System.out.println(isNumber(nm));
        checkIsType(st);
        checkIsType(nm);

       // System.out.println(info2.getValue() instanceof String);



    }

    public static <T> void checkIsType (T t){
        if(isString(t)){
            System.out.println(t+" - it's String :)");
        }
        else if(isNumber(t)){
            System.out.println(t+" - it's Number :)");
        }
        else{
            System.out.println(t+" - isn't String or String :(");
        }
    }

}

/*
public static void checkIsString (String st){
        if(isString(st)){
            System.out.println(st+" - it's String :)");
        }else{
            System.out.println(st+" - isn't String :(");
        }

 */
