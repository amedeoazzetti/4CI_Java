
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

    public double getFinalDamage() {
        return finalDamage;
    }

    public double getFinalFireRate() {
        return finalFireRate;
    }

    public void updateStats(){
        finalDamage = BaseDamage;
        finalFireRate = baseFireRate;

        for (Passive p : passives) {
            finalDamage *= p.getDamageMod();
            finalFireRate *= p.getFireMod();
        }
        if (Active!=null) {
            finalDamage *= Active.getDamageMod();
            finalFireRate *= Active.getFireMod();
        }
        if (trinket!=null) {
            finalDamage *= trinket.getDamageMod();
            finalFireRate *= trinket.getFireMod();
        }
    }
}
