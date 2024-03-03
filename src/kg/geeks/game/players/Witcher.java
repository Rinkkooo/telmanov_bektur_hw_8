package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.HEALTH_EXCHANGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0){
                heroes[i].setHealth(this.getHealth());
                System.out.println(this.getName() + " donated health " + heroes[i].getName());
                this.setHealth(0);
                break;
            }
        }
        }
    }
}
