package nested_classes.inner_classes;

public class Car {
    private String color;
    private int doorCount;
    private Engine engine;

    public Car(String color, int doorCount) {
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color = '" + color + '\'' +
                ", soorCount = " + doorCount +
                ", engine = " + engine +
                '}';
    }
    public class Engine {
        private int horsePower;
        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
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
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow", 4).new Engine(200);

//        Car.Engine engine2 = car.new Engine(150);
    }
}

