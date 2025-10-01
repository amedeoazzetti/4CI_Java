
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
        } else {
            trinket = (Trinket) nuovo;
        }
    }

    public void dropTrinket() {
        trinket = null;
    }

    public boolean ricarica() {
        boolean remove = false;
        for (int i = collectibles.size() - 1; i >= 0; i--) {
            if (collectibles.get(i) instanceof Battery) {

                collectibles.remove(i);
                Active.reload();
                remove = true;
                return remove;

            }

        }
        return remove;
    }

    public boolean cura() {
        boolean remove = false;

        for (int i = collectibles.size() - 1; i >= 0; i--) {
            if (collectibles.get(i) instanceof Heart) {
                collectibles.remove(i);
                if (hp < HpMax) {
                    hp += 1;
                    remove = true;
                    return remove;

                }
            }

        }
        return remove;
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

    public void updateStats() {
        finalDamage = BaseDamage;
        finalFireRate = baseFireRate;

        for (Passive p : passives) {
            finalDamage *= p.getDamageMod();
            finalFireRate *= p.getFireMod();
        }
        if (Active != null) {
            finalDamage *= Active.getDamageMod();
            finalFireRate *= Active.getFireMod();
        }
        if (trinket != null) {
            finalDamage *= trinket.getDamageMod();
            finalFireRate *= trinket.getFireMod();
        }
    }

}
