public class Medic extends Hero{
    private int healthPoints;

    public Medic(int health, int damage, String superAbility, int healthPoints) {
        super(health, damage, superAbility);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints(int healthPoints) {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Лекарь исцеляет союзника");
    }

}
