package nested_classes.static_nested_class;

public class Car {
    private String color;
    private int doorCount;
    private Engine engine;
    private static int a;

    public Car(String color, int soorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    interface I{}

    @Override
    public String toString() {
        return "My car: {" +
                "color = '" + color + '\'' +
                ", soorCount = " + doorCount +
                ", engine = " + engine +
                '}';
    }
    public static class Engine{
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower = " + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(300);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);

        Car.Engine engine2 = new Car.Engine(123);
    }
}

