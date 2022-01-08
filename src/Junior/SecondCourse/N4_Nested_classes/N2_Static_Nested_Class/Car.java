package Junior.SecondCourse.N4_Nested_classes.N2_Static_Nested_Class;

public class Car {
     String color;
    int doorCount;
     Engine engine;

    public Car(String color, int doorCount, int engineHorsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = new Engine(engineHorsePower);
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        System.out.println(this.engine);
    }

    interface I{}

    public static  class Engine{
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println("Engine created");
            //System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
       Car car1 = new Car("Black",4,200);
       Car.Engine eng1 = new Car.Engine(225);
       Car car2 = new Car("Red",2,eng1);
       car1.method();
    }
}

class TwinEngine extends Car.Engine{

    public TwinEngine(int horsePower) {
        super(horsePower);
    }
}