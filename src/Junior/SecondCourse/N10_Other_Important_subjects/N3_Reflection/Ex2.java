package Junior.SecondCourse.N10_Other_Important_subjects.N3_Reflection;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class employeeClass = Class.forName("Junior.SecondCourse.N10_Other_Important_subjects.N3_Reflection.Employee");
        //Object o = employeeClass.newInstance(); // old realisation
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        //Object obj1 = constructor1.newInstance(); //or
        //Employee obj1 = (Employee) constructor1.newInstance();
        Employee obj1 =  constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5,"Alex","IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);

    }
}
