package main;
public class Quadrato extends Figura {
    
    public Quadrato(double lato) {
        super(lato);
        // super() chiamata implicita al costruttore vuoto
    
    }

    @Override
    public double calcolaArea() {   
        return lato * lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato * 4;
    }
}
