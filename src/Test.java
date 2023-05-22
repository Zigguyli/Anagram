public class Test {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Isagi", 17);
        hero1.giveArmy(100);
        Hero hero2 = new Hero("Ruslan", 15);
        hero2.giveArmy(200);

        int armyHero_1 = hero1.getArmy();
        int armyHero_2 = hero2.getArmy();
        String nameHero1 = hero1.getName();
        String nameHero2 = hero2.getName();

        String result = battleField(armyHero_1, armyHero_2, nameHero1, nameHero2);
        System.out.println(result);
    }
    static String battleField(int amountArmy_1, int amountArmy_2, String name1, String name2 ) {
        if (amountArmy_1 > amountArmy_2) {
            return name1 + " WON!!!";
        }
        return name2 + " WON!!!";
    }
}

