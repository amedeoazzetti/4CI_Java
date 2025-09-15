package main;
public class Triangolo extends Figura {
    
    public Triangolo(double lato) {
        super(lato);
    }

    @Override
    public double calcolaArea() {
        return lato*lato * Math.sqrt(3) / 4.0;
    }

    @Override
    public double calcolaPerimetro() {
        return lato * 3;
    }
}
