package Junior.FirstCourse.HomeWork.HW30_Lambda.MyExamples;
/*
1)Создать класс Car, класс CarInfo и реализовать вывод списка по скорости,  и тд -> Predicate<T>
2)Попробовать повычитать разность скорость полей обьектов через -> BinaryOperator
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;

import static Junior.FirstCourse.HomeWork.HW30_Lambda.MyExamples.Car.getCounter;
import static Junior.FirstCourse.HomeWork.HW30_Lambda.MyExamples.CarsOperations.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CarBuilder carBuilder = Car::new;
        Car car1 = carBuilder.create("Honda","Sport",300,280);
        //info(car1);
        Car car2 = new Car("Subaru","Sport",270,270);
        Car car3 = new Car("Hyundai","Taxi",150,220);
        Car car4 = new Car("Smart","Delivery",80,140);
        Car car5 = new Car("Lada","Citizen",110,180);
        Car car6 = new Car("Ferrari","Sport",444,340);
//        System.out.printf("Total cars : %d. \n", getCounter());

        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5, car6));
//        for(Car car : carsList){
//            info(car);
//            System.out.println("-------");
//        }
        //Predicate<T>
        System.out.println("Машины чья скорост выше 240");
        filtrationCars(carsList,car -> car.getSpeed() > 240);
        filtrationCars(carsList, car -> car.getUse().equals("Sport")
                && car.getHorsePower() > 270);
        System.out.println("------------------------------------");

        System.out.println("Спортивные машины чья Л.сила больше 270и: ");
        filtrationCars(carsList, car -> car.getUse().equals("Sport") && car.getHorsePower() > 270);
        System.out.println("------------------------------------");

        //BinaryOperator<T>
        BinaryOperator <Double> differentSpeed = (x,y) -> x-y;
        Double ds = differentSpeed.apply(car1.getSpeed(),car2.getSpeed());
        System.out.printf("Разница в скорости %s и %s состовляет %.1f км. " +
                "\n",car1.getName(),car2.getName(),ds);
        System.out.println("------------------------------------");

        //UnaryOperator<T>
        UnaryOperator<Double> boostSpeed = x -> x + (x * 0.10) ; //boost 10%
        car1.setSpeed(boostSpeed.apply(car1.getSpeed()));
        System.out.printf("Speed %s with \"Boost speed\" =  %.1f км." +
                "\n",car1.getName(), car1.getSpeed());

        //Function<T,R>
        Function<Integer, String> convert = x-> String.valueOf(x)
                + " единиц (теперь это стринг)";
        int test1 = 777;
        String stringTest1 = convert.apply(test1);
        System.out.println(stringTest1); //"777 единиц (теперь это стринг)"

        //Consumer<T>
        Consumer<Integer> printer = x->
                System.out.printf("%d единиц \n", x);
        printer.accept(600); // 600 единиц

        changeCar(car1,car -> car.setHorsePower(777));

        Consumer<Car> carConsumer = car -> {
            car.setHorsePower(777);
            car.setUse("Civil");
            car.setSpeed(180);
        };
        //carConsumer.accept(ourCars.get(0));
        carsList.forEach(carConsumer);
        //car -> {carConsumer.accept(car);} //carConsumer::accept


        //Supplier<T>
        Supplier<Car> carFactory = ()->{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myName = null;
            String myUse = null;
            double  myHorsePower = 0;
            double mySpeed = 0;
            try {
                System.out.println("Введите марку машины :");
                myName = reader.readLine();
                System.out.println("Введите класс машины :");
                myUse = reader.readLine();
                System.out.println("Введите лошадиные силы машины :");
                myHorsePower = Double.parseDouble(reader.readLine());
                System.out.println("Введите максимальную скорость машины :");
                mySpeed = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new Car(myName,myUse,myHorsePower,mySpeed);
        };

        System.out.println("Проверяем созданные обьекты :");
        Car car7 = carFactory.get();
        info(car7);
        System.out.printf("Total cars : %d. \n", getCounter());


        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("asd","asd",77,77));





    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }


}

