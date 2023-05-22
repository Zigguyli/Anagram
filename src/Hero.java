public class Hero {
    private String name;
    private int age;
    private int army;
    Hero() {}
    Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void giveArmy(int army) { this.army = army; }
    int getArmy() { return army; }
    String getName() { return name; }
}
