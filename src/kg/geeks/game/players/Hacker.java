package kg.geeks.game.players;

import kg.geeks.game.logic.RpgGame;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.HEALTH_TRANSFER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0 && boss.getHealth() > 0){
            boss.setHealth(boss.getHealth() - 10);
            int x = RpgGame.random.nextInt(heroes.length);
            heroes[x].setHealth(heroes[x].getHealth() + 10);
            System.out.println(this.getName() + " steals 10 health from the boss and gives " + heroes[x].getName());
            }
    }
}
