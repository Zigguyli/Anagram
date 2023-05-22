package nested_classes.local_inner_classes;

public class LocalInner2 {
    public static void main(String[] args) {
        class Slojenie implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slojenie s = new Slojenie();
        System.out.println(s.doOperation(4, 5));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}