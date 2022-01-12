package Junior.SecondCourse.N10_Other_Important_subjects.N4_Anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {
    //@MyAnnotation
    String name;
    double salary;
    //@MyAnnotation
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @MyAnnotation
    public void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//создадим нашу аннотацию
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}