


public class Medico extends Giocatore {
    final int MANA_CURA = 20;

    public Medico(String nome, int hp, int mana, int peso, Razza razza) {
        super(hp, mana, nome, peso, razza);

    }
        @Override
        public int attacca(Giocatore target, int cura){

            // verificare che ci sia abbastanza mana per curare un giocatore

            if (mana - MANA_CURA >= 0) {
                mana -= MANA_CURA;

                int nuovoHp = target.getHp() + cura;
                target.setHp(nuovoHp > target.HP_MAX ? target.HP_MAX : nuovoHp);
                target.setHp(hp);

                return cura;
            }

            return 0;
        }
    

    @Override
    public void ricaricaMana() {
        
    }
    public boolean rianima(Giocatore target){
        // se il giocatore è ancora vivo, non rianimo
        if (!target.isMorto()) {
            return false;
        }else{
            target.setHp(target.HP_MAX / 4);
            return true;
        }
        
    }
}
