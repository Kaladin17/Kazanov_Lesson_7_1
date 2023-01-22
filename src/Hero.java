public abstract class Hero implements HavingSuperAbility {
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        SuperAbility = superAbility;
    }

    private int health;
    private int damage;
    private String SuperAbility;


}
