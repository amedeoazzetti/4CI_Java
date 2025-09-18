
import java.util.ArrayList;

public abstract class Giocatore{

    protected String name;
    protected int hp;
    protected final int HP_MAX, MANA_MAX, PESO_MAX;
    protected int mana;
    protected int peso;
    protected Razza razza;
    protected ArrayList<Equip> inventario;

    public Giocatore(int hp, int mana, String name, int peso, Razza razza) {
        this.hp = this.HP_MAX = hp;
        this.mana = this.MANA_MAX = mana;
        this.name = name;
        this.peso = this.PESO_MAX = peso;
        this.razza = razza;

        this.inventario = new ArrayList<>();
    }



}