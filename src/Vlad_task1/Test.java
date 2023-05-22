package Vlad_task1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Hero rustikHero = new Hero("Ruslan", "Swordman", 39, 3);
        Pikeman pikeman1 = new Pikeman();
        pikeman1.setName("Pikeman");
        rustikHero.addCreature(pikeman1, 100);

        Hero ilyasHero = new Hero("Ilyas", "Magicman", 23, 2);
        Pikeman pikeman2 = new Pikeman();
        pikeman2.setName("Pikeman");
        Griffin griffin2 = new Griffin();
        griffin2.setName("Griffin");
        ilyasHero.addCreature(griffin2, 80);
        ilyasHero.addCreature(pikeman2, 157);

        Battlefield battle_1 = new Battlefield();
        String result = battle_1.battle(rustikHero, ilyasHero);
        System.out.println(result);
    }
}
