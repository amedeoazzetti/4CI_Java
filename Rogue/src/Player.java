
import java.util.ArrayList;

public class Player {

    private ArrayList<Passive> passives;
    private ArrayList<Collectible> collectibles;
    private Active Active;
    private Trinket trinket;
    private int hp;
    private final int HpMax;
    private double BaseDamage, finalDamage, baseFireRate, finalFireRate;

    public Player(double BaseDamage, int HpMax, double baseFireRate, int hp) {
        this.BaseDamage = BaseDamage;
        this.HpMax = HpMax;
        this.baseFireRate = baseFireRate;
        this.hp = hp;
    }

    






}
