
public class Pianeta extends CorpoCeleste {

    public Pianeta(String nome, double distanza, double massa, double raggio) {
        super(nome, distanza, massa, raggio);
    }

    public double getPeriodo(double massaStella) {
        {
            double periodo = 2 * Math.PI * Math.sqrt(Math.pow(this.distanzaStella, 3) / (massaStella * G));
            return periodo / 3600 / 24; // in giorni
        }

    }
}
