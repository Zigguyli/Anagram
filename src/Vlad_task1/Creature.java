package Vlad_task1;

public abstract class Creature {
    private String name;
    private int level, attack, protection, speed, amount = 0;

    public int getDamage(int attack, int protection) {
        if (attack > protection) {
            return attack - protection;
        }
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLevel(int level) {
        this.level += level;
    }

    public void addAttack(int attack) {
        this.attack += attack;
    }

    public void addProtection(int protection) {
        this.protection += protection;
    }

    public void addSpeed(int speed) {
        this.speed += speed;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }
    public void removeAmount(int amount) {
        this.amount -= amount;
    }

    public int getAmount() {
        return amount;
    }
}
