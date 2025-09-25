
import java.util.ArrayList;

public class Squadra {
    
    private final ArrayList<Giocatore> giocatori;

    public Squadra(){

        giocatori = new ArrayList<>(4);

        }

        public void aggiungiGiocatore(Giocatore nuovo){
            giocatori.add(nuovo);
    }

    public void salutaTutti(){
        for (Giocatore giocatore : giocatori) {
            if(!giocatore.isMorto())
            giocatore.saluta();
        }
    }
}
