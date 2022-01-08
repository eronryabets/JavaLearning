package Junior.FirstCourse.Lections.Les26EqualsAndToString.Equals;

import java.util.ArrayList;

public class TestEqualsContains {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
//        System.out.println(c1.equals(c2));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black","V8");
        System.out.println(list.contains(c4));
        System.out.println(c4);


    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
        public boolean equals(Object obj){
        if(obj instanceof Car){
            Car c2 = (Car)obj;
            return (color.equals(c2.color)) && engine.equals((c2.engine));
        }
        else return false;
    }

    public String toString(){
        return "Car color : " + color + " ; Engine : " + engine + ";";
    }
//ОСТАНОВИЛСЯ НА 27.15 Wrapper classes

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Car) {
//            return (color.equals(((Car) obj).color)) && engine.equals(((Car) obj).engine);
//        } else return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(color, engine);
//    }
// IDE создала :
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(color, car.color) &&
//                Objects.equals(engine, car.engine);
//    }
//
//    Или же такой пример кастинга ( как в лекции)
//    @Override
//    public boolean equals(Object obj){
//        if(obj instanceof Car){
//            Car c2 = (Car)obj;
//            return (color.equals(c2.color)) && engine.equals((c2.engine));
//        }
//        else return false;
//    }

}
