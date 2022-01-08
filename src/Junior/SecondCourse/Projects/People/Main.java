package Junior.SecondCourse.Projects.People;

/*
Изначальный компаратор для машин - по скорости.
Для людей - по рейтингу.
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","s2000","Green","V6",440);
        Car car2 = new Car("Subaru","ForesterSG5","Blue","V6",330);
        Car car3 = new Car("Acura","SX","Red","V8",450);
        Person p1 = new Person("Alex","Rune",1985,25,car1);
        Person p2 = new Person("Judy","Churcher",1995,18,car2);
        Person p3 = new Person("Horus","Luperkal",1991,33,car3);

        getFaster(car1,car2);
        System.out.println(car1.compareTo(car2));
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);
        //personArrayList.forEach(System.out::println);
        //System.out.println("==================================");
        PersonRateComparator personRateComparator = new PersonRateComparator();
        personArrayList.sort(personRateComparator);
        personArrayList.forEach(System.out::println);
        System.out.println("==================================");
        upRateAll(personArrayList,10);
        personArrayList.forEach(System.out::println);
        System.out.println("==================================");
        personArrayList.removeIf(person -> person.getRate() < 30);
        System.out.println(personArrayList.isEmpty());
        personArrayList.forEach(System.out::println);

        System.out.println("==================================");
        //filtrationCars(personArrayList,person -> person.getCar().getHorsePower()>400);






    }


    static public int getFaster(Car car1, Car car2){
        int result = car1.getHorsePower()-car2.getHorsePower();
        if(result > 0){
            System.out.printf("%S %s faster than %S %s by %d . \n", car1.getBrand(),car1.getModel(),car2.getBrand(),car2.getModel(),result);
        }else if (result < 0){
            System.out.printf("%S %s slower than %S %s by %d . \n", car1.getBrand(),car1.getModel(),car2.getBrand(),car2.getModel(),result);
        } else {
            System.out.printf("%S %s and %S %s equal in the horse power . \n", car1.getBrand(),car1.getModel(),car2.getBrand(),car2.getModel(),result);
        }
        return result;
    }

    static public void upRate(Person person, int value){
        person.setRate(person.getRate() + value);
    }

    static public void upRateAll(ArrayList<Person> list, int value){
        list.forEach(p->upRate(p,value));
        System.out.println("All people raise their rate by " + value);
    }
    public static void filtrationCars(ArrayList<Person> list, Predicate<Person> predicate){
        int count = 0;
        for(Person person : list){
            if(predicate.test(person)){
                System.out.println(person);
                count++;
            }
        }
        System.out.printf("Для данного фильтра совпало %d person. \n" ,count);
    }


    public static class PersonAgeComparator implements  Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getYear()-o2.getYear();
        }
    }

    public static class PersonRateComparator implements  Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return  (o1.getRate()-o2.getRate());
        }
    }

}
