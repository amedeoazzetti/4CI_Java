package main;
// superclasse
public abstract class Figura {
    
    protected double lato;

    public Figura(double lato) {

        this.lato = lato;
    }

    public Figura() {}

    // prototipo
    public abstract double calcolaArea();
    public abstract double calcolaPerimetro();
    
}
