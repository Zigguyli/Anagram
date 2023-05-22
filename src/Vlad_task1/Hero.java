package Vlad_task1;

import java.util.ArrayList;

public class Hero {
    private String name, fraction;
    private int exp, level;
    ArrayList<Creature> arrayList = new ArrayList<>();

    public Hero(String name, String fraction, int exp, int level) {
        this.name = name;
        this.fraction = fraction;
        this.exp = exp;
        this.level = level;
    }

    public void addCreature(Creature creature, int quantity) {
        creature.addAmount(quantity);
        arrayList.add(creature);
    }
    public void removeCreature(Creature creature, int quantity) {
        creature.removeAmount(quantity);
    }

    public void getArmy() {
        for(Creature creature : arrayList) {
            System.out.println(creature);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getFraction() {
        return fraction;
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<Creature> getArrayList() {
        return arrayList;
    }
}
