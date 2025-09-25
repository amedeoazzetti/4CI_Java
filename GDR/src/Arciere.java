
public class Arciere extends Giocatore {

    public Arciere(String nome, int hp, int mana, int peso, Razza razza) {
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

      

        int multi = 1;
        if (target instanceof Guerriero || target instanceof Mago) {
            multi = 2;
        }

        // modifico i puntivita del target
        int dannoFinale = multi * danno / (armatura + 1);
        target.setHp(target.getHp() - dannoFinale);


        // se ho sconfitto qualcuno, ricarico
        
        return dannoFinale;

 }
}