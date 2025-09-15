package other;
import main.Figura;

public class Cerchio extends Figura {
    
    private double raggio;

    public Cerchio(double raggio) {
        super(raggio);

        raggio = lato;
    }

    @Override
    public double calcolaArea() {
        return raggio*raggio*Math.PI;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * raggio * Math.PI;
    }
}

