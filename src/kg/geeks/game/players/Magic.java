package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0){
                    heroes[i].setDamage(heroes[i].getDamage() + 10);
                }
            }
        }
        System.out.println(this.getName() + " increased the damage of all heroes by 10");
    }
}
