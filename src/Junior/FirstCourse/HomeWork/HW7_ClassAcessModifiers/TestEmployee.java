package Junior.FirstCourse.HomeWork.HW7_ClassAcessModifiers;

public class TestEmployee {
    public static void main(String[] args) {
        Employee max = new Employee("Max",33,700,"Operator"); //public access
        Employee sergio = new Employee("Sergio",650); //default access
        //Employee alex = new Employee("Alex",500,24); //private access - доступен только в классе своем
        max.idOnDisplay();
        max.surnameOnDisplay();
        max.salaryOnDisplay();
        System.out.println(max);

        sergio.idOnDisplay();
        sergio.surnameOnDisplay();
        sergio.salaryOnDisplay();
        System.out.println(sergio);


        System.out.println(sergio.surname);
        //System.out.println(sergio.salary); // have'nt access


    }
}
