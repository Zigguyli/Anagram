package Vlad_task1;

import java.util.ArrayList;

public class Battlefield {
    static int counter_1 = 0;
    static int counter_2 = 0;
    static int i = 0;
    public static String battle(Hero hero1, Hero hero2) {
        if (hero1.getExp() > hero2.getExp()) {
            counter_1 += 1;
        } else {
            counter_2 += 1;
        }
        if (hero1.getLevel() > hero2.getLevel()) {
            counter_1 += 1;
        } else {
            counter_2 += 1;
        }
        while (hero1.getArrayList().size() > i || hero2.getArrayList().size() > i) {
            if (hero1.getArrayList().get(i).getAmount() > hero2.getArrayList().get(i).getAmount()) {
                counter_1 += 1;
            } else {
                counter_2 += 1;
            }
            i++;
        }
//        System.out.println(counter_1);
//        System.out.println(counter_2);
        if (hero1.getArrayList().size() > hero2.getArrayList().size()) {
            counter_1 = hero1.getArrayList().size() - hero2.getArrayList().size();
        } else {
            counter_2 = hero2.getArrayList().size() - hero1.getArrayList().size();
        }
//        System.out.println(counter_1);
//        System.out.println(counter_2);
        if (counter_2 == counter_1) { return "Draw"; }
        if (counter_1 > counter_2) {
            return "Winner is " + hero1.getName();
        } else {
            return "Winner is " + hero2.getName();
        }
    }
}
