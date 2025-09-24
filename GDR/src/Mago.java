
public class Mago extends Giocatore {

    private final int MANA_ATT = 20;

    public Mago(String nome, int hp, int mana, int peso, Razza razza) {
        super(hp, mana, nome, peso, razza);
    }

    @Override
    public int
            attacca(Giocatore target, int danno) {
        // verifico se il target ha armatura
        int armatura = 0;

        for (Equip equip : target.getInventario()) {
            if (equip.getTipo() == TipoEquip.Armatura) {
                armatura++;
            }
            target.setHp(target.getHp() - danno / (armatura + 1));
        }

        // verificare se c'è abbastanza mana
        if (mana - MANA_ATT >= 0) {
            mana -= MANA_ATT;
        }


        int multi = 1;
        if (target instanceof Guerriero || target instanceof Arciere) {
            multi = 2;
        }

        // modifico i puntivita del target
        int dannoFinale = multi * danno / (armatura + 1);
        target.setHp(target.getHp() - dannoFinale);
        return dannoFinale;

    }
}
