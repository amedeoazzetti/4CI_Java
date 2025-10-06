
import java.util.ArrayList;

public class Sistema {

    private ArrayList<CorpoCeleste> corpiCelesti; // generics

    public Sistema() {
        this.corpiCelesti = new ArrayList<>();
    }

    /**
     * aggiungo nuovo corpo celeste da aggiungere
     *
     * @param c
     */
    public void aggiungiPianeta(CorpoCeleste c) {
        corpiCelesti.add(c);
    }

    /**
     * Conta quante stelle ci sono nella collezione
     *
     * @return
     */
    public int contaStelle() {

        int con = 0;
        for (int i = 0; i < corpiCelesti.size(); i++) {
            if (corpiCelesti.get(i) instanceof Stella) {
                con++;
            }

        }
        return con;
    }

    /**
     * verifica se tutti i pianeti sono consecutivi (ovvero non ci sono stelle
     * presenti nel mezzo)
     *
     * @return
     */
    public boolean pianetiConsecutivi() {

        boolean trovatoStella = false;
        for (int i = 0; i < corpiCelesti.size(); i++) {
            if (corpiCelesti.get(i) instanceof Stella) {
                trovatoStella = true;
            } else if (trovatoStella && corpiCelesti.get(i) instanceof Pianeta) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verificare che le distanze dalla stella dei pianeti nella collezione
     * siano in ordine decrescente
     *
     * @return vero se la lista dei pianeti è ordianta
     */
    public boolean pianetiOrdinati() {

        for (int i = 0; i < corpiCelesti.size(); i++) {
            if (corpiCelesti.get(i) instanceof Pianeta) {
                for (int j = 1; j < corpiCelesti.size(); j++) {
                    if (corpiCelesti.get(i).distanzaStella > corpiCelesti.get(j).distanzaStella) {
                    } else {
                        return false;
                    }

                }
            }

        }
        return true;
    }

    public int rimuoviPianeti(String s) {

        int con = 0;
        for (int i = corpiCelesti.size() - 1; i <= 0; i--) {
            if (corpiCelesti.get(i).nome == s) {
                corpiCelesti.remove(i);
                con++;
            }

        }
        return con;
    }

}
