package solidi;
import other.Cerchio;

public class Cilindro extends Cerchio implements Solido {

    private double h;

    public Cilindro(double raggio, double h) {
        super(raggio);
        
        this.h = h;
    }
    
    @Override
    public double calcolaArea() {
        // TODO Auto-generated method stub
        return super.calcolaArea();
    }

    @Override
    public double calcolaPerimetro() {
        return super.calcolaPerimetro();
    }

    @Override
    public double calcolaVolume() {
        return calcolaArea() * h;
    }

    @Override
    public double calcolaSuperficie() {
        return calcolaPerimetro() * h + 2*calcolaArea();
    }
}
