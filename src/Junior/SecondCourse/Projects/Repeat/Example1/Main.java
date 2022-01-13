package Junior.SecondCourse.Projects.Repeat.Example1;

import static Junior.SecondCourse.Projects.Repeat.Example1.Person.showNames;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //StringBuilder sb = new StringBuilder("test");
        //String t1 = sb.toString();
        Pupils p1 = new Pupils("Alex",Team.RACCOONS,10,"10-A");
        Pupils p2 = new Pupils("Alina",Team.RACCOONS,18,"9-B");
        Pupils p3 = new Pupils("Dima",Team.RACCOONS,17,"11-V");
        Pupils p4 = new Pupils("Inna",Team.RACCOONS,22,"10-A");
        Pupils p5 = new Pupils("Petro",Team.RACCOONS,29,"11-A");
        List<Pupils> pupils = new ArrayList<>();
        pupils.add(p1);
        pupils.add(p2);
        pupils.add(p3);
        pupils.add(p4);
        pupils.add(p5);
        //showNames(pupils);
        //pupils.stream().filter(x->x.getRate()>20).forEach(System.out::println);
        pupils.stream().forEach(x->{
            String newName = (x.getName().toString()) + "_:)";
            x.setName(newName);
            //System.out.println(x);
            ;});

        //Reflection - Попробуем поменять team и rate (метод setTeam и setRate - private)
        Class pupilsClass = Pupils.class;
        Class personClass = Person.class;
        Field [] allFields = personClass.getDeclaredFields();
        System.out.println("All fields :");
        Arrays.stream(allFields).forEach(x->{
            System.out.println("Name: " + x.getName() + "; Type: " + x.getType());
            ;});

        System.out.println("All methods :");
        Method[] allMethods = personClass.getDeclaredMethods();
        Arrays.stream(allMethods).forEach(x->{
//            if(Modifier.isPrivate((x.getModifiers()))){
//
//            }
            System.out.println("Name: " + x.getName() + "; Type: " + x.getReturnType());
            ;});
        //сменим rate
        Method methodSetRate = personClass.getDeclaredMethod("setRate", double.class);
        methodSetRate.setAccessible(true);
        methodSetRate.invoke(p1,99);
        System.out.println(p1);

        //сменим team
//        Method methodSetTeam = personClass.getDeclaredMethod("setTeam", Team.class);
//        methodSetTeam.setAccessible(true);
//        methodSetTeam.invoke(p1,Team.MOUNTAIN);
//        System.out.println(p1);
        //удалим метод setTeam с класса Person
        Field teamField = personClass.getDeclaredField("team");
        teamField.setAccessible(true);
        teamField.set(p1,Team.SMART);
        System.out.println(p1);

        p1.showYourName();














    }
}
//Если бы SetRate был public - такое бы рошло. Но с private не пройдет!
//        Method methodSetRate = personClass.getMethod("setRate", double.class);
//        methodSetRate.invoke(p1,99);
//        System.out.println(p1);