package Junior.SecondCourse.N10_Other_Important_subjects.N3_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //1
        Class employeeClass = Class.forName(
                "Junior.SecondCourse.N10_Other_Important_subjects.N3_Reflection.Employee");
//        //2
//        Class employeeClass2 = Employee.class;
//        //3
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();
        Field someField = employeeClass.getField("id");
        //System.out.println("Type of id field = " + someField.getType());

        Field [] fields = employeeClass.getFields();
        for(Field field: fields){
            //System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Field [] allFields = employeeClass.getDeclaredFields();
        for(Field field: allFields){
            //System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
//        System.out.println(
//                "Return type of method increaseSalary = " + someMethod1.getReturnType() +
//                ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
//        System.out.println(
//                "Return type of method increaseSalary = " + someMethod2.getReturnType() +
//                        ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));

        Method[] methods = employeeClass.getMethods();
//        for(Method method: methods){
//            System.out.println("Name of method = " + method.getName() +
//                    ", return type = " + method.getReturnType() +
//                    ", parameter types = " +
//                    Arrays.toString(method.getParameterTypes()));
//        }

        Method[] allMethods = employeeClass.getDeclaredMethods();
//        for(Method method: allMethods){
//            System.out.println("Name of method = " + method.getName() +
//                    ", return type = " + method.getReturnType() +
//                    ", parameter types = " +
//                    Arrays.toString(method.getParameterTypes()));
//        }

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
//        for(Method method: allMethods){
//            if(Modifier.isPublic(method.getModifiers()))
//            System.out.println("Name of method = " + method.getName() +
//                    ", return type = " + method.getReturnType() +
//                    ", parameter types = " +
//                    Arrays.toString(method.getParameterTypes()));
//        }
       Constructor constructor1 = employeeClass.getConstructor();
//        System.out.println("Constructor has " + constructor1.getParameterCount()
//                + " parameters, their types are: " +
//                Arrays.toString(constructor1.getParameterTypes()));

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount()
                + " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));

        Constructor [] constructors = employeeClass.getConstructors();
        for(Constructor constructor: constructors){
            System.out.println("constructors " + constructor.getName() +
                    " has "  + constructor.getParameterCount() +
                     " parameters, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }






    }
}
