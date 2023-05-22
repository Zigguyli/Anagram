package nested_classes.local_inner_classes;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}

class Math {
    private int delimoe = 21;
    public void getResult(final int delimoe, final int delitel) {
        class Delenie {
            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
//                System.out.println(a);
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}