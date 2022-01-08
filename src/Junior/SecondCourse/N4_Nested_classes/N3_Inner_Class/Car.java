package Junior.SecondCourse.N4_Nested_classes.N3_Inner_Class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

//    public Car(String color, int doorCount, int engineHorsePower) {
//        this.color = color;
//        this.doorCount = doorCount;
//        this.engine = this.new Engine(engineHorsePower);
//    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }
    public void setEngine(Engine engine){
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

//    void method(){
//        System.out.println(Engine.countOfObjects);
//        System.out.println(this.engine);
//    }

    interface I{}

    public   class Engine{
        private int horsePower;
        public final static  int A = 5;


        public Engine(int horsePower) {
            this.horsePower = horsePower;

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
        Car car2 = new Car("Black",4);
        Car.Engine eng1 = car2.new Engine(150);
        car2.setEngine(eng1);
        Car.Engine eng2 = new Car("Green",2).new Engine(333);

    }
}

//class TwinEngine extends Car.Engine{
//
//    public TwinEngine(int horsePower) {
//        super(horsePower);
//    }
//}