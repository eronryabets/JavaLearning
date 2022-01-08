package Junior.FirstCourse.Lections.Les12ifElseEquals;

import java.util.Objects;

public class Car {
    int engine;
    int doors;

    public Car(int engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine &&
                doors == car.doors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, doors);
    }

    public static void main(String[] args) {
        Car car1 = new Car(2,2);
        Car car2 = new Car(2,2);

        //car1=car2 нельзя сравнить так как они хранят ссылки на данные, а они разные
        //для этого нужно переобределить метод equals и сравнивать через него car1.equals(car2)
        if(car1.engine == car2.engine & car1.doors == car2.doors ){
            System.out.println("car1 = car2 ");
        }
        else if (car1.engine == car2.engine){
            System.out.println("Only car1 engine = car2 engine");
        }
        else if (car1.doors == car2.doors){
            System.out.println("Only car1 doors = car2 doors");
        }
        else{
            System.out.println("car1 != car2");
        }

        System.out.println("Сравнение серез equals car1==car2");
        if (car1.equals(car2)){
            System.out.println("car1 = car2");
        }
        else {
            System.out.println("car1 != car2");
        }



    }
}
