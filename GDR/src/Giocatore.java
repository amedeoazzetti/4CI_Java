
import java.util.ArrayList;

public abstract class Giocatore {

    protected String nome;
    protected int hp;
    protected final int HP_MAX, MANA_MAX, PESO_MAX;
    protected int mana;
    protected int peso;
    protected Razza razza;
    protected ArrayList<Equip> inventario;

    public Giocatore(int hp, int mana, String nome, int peso, Razza razza) {
        this.hp = this.HP_MAX = hp;
        this.mana = this.MANA_MAX = mana;
        this.nome = nome;
        this.peso = this.PESO_MAX = peso;
        this.razza = razza;

        this.inventario = new ArrayList<>();
    }

    public void attaccaMischia(Giocatore target, int danno) {

        boolean haArma = false;

        //cerco nell'inventario se ho almeno un arma 
        for (Equip e : inventario) {
            if (e.getTipo() == TipoEquip.ArmaMelee) {
                haArma = true;
                break;
            }
        }

        //controllare l'istanza del mio oggetto e attacco solo se ho l'arma
        if (!(this instanceof Guerriero ) || !haArma) {
            return;
        }

        // verifico se il target ha armatura
        int armatura = 0;

        for (Equip equip : target.getInventario()) {
            if (equip.getTipo() == TipoEquip.Armatura) {
                armatura++;
            }
        }

    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getPeso() {
        return peso;
    }

    public ArrayList<Equip> getInventario() {
        return inventario;
    }

}