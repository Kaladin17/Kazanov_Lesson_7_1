public class Main {
    public static void main(String[] args) {

              HavingSuperAbility[] HavingSuperAbilities = {new Magic(200, 20, "Magic orb"),
                new Medic(300, 0, "Health", 20), new Warrior(250, 15, "Critical damage")};

        for (HavingSuperAbility heroes: HavingSuperAbilities) {
              heroes.applySuperAbility();
        }
    }
}