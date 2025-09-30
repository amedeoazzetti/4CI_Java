
import java.util.ArrayList;

public class Player {

    private ArrayList<Passive> passives;
    private ArrayList<Collectible> collectibles;
    private Active Active;
    private Trinket trinket;
    private int hp;
    private final int HpMax;
    private double BaseDamage, finalDamage, baseFireRate, finalFireRate;

    public Player(double BaseDamage, double baseFireRate, int hp) {
        this.BaseDamage = BaseDamage;
        this.baseFireRate = baseFireRate;
        this.hp = this.HpMax = hp;
        passives = new ArrayList<>();
        collectibles = new ArrayList<>();
    }

    public void updateStats() {
             
    }

    public void viewStats() {
        System.out.println("HP: " + hp + "/" + HpMax);
        System.out.println("Damage: " + finalDamage);
        System.out.println("Fire Rate: " + finalFireRate);
    }

    public void addItem(Item nuovo) {
        if (nuovo instanceof Passive) {
            passives.add((Passive) nuovo);
        } else if (nuovo instanceof Active) {
            Active = (Active) nuovo;
        } else if (nuovo instanceof Trinket) {
            trinket = (Trinket) nuovo;
        }
    }

    public void dropTrinket() {
        trinket = null;
    }

    public boolean checkCollectibles() {
        boolean removed = false;
        for (int i = collectibles.size() - 1; i >= 0; i--) {
            if (collectibles.get(i) instanceof Trinket) {
                collectibles.remove(i);
                removed = true;
            }
        }
        return removed;
    }
    public double getFinalDamage() {
        return finalDamage;
    }

    public double getFinalFireRate() {
        return finalFireRate;
    }

}
