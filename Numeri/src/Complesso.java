
public class Complesso implements Numero {

    private double reale, imm;

    public Complesso(double reale, double imm) {
        this.reale = reale;
        this.imm = imm;
    }

    // getter e setter
    public double getReale() {
        return reale;
    }

    public void setReale(double reale) {
        this.reale = reale;
    }

    public double getImm() {
        return imm;
    }

    public void setImm(double imm) {
        this.imm = imm;
    }

    @Override
    public String toString() {
        return reale + "/" + imm + "i";
    }

    @Override
    public void somma(Numero altro) {
        Complesso c = (Complesso) altro;

        this.reale += c.getReale();
        this.imm += c.getReale();
    }

    @Override
    public void sottrai(Numero altro) {
        Complesso c = (Complesso) altro;

        this.reale -= c.getReale();
        this.imm -= c.getReale();
    }

    @Override
    public void moltiplica(Numero altro) {
        Complesso c = (Complesso) altro;

        double r = this.reale * c.getReale() - this.imm * c.getImm();
        double i = this.reale * c.getImm() + this.imm * c.getReale();

        this.reale = r;
        this.imm = i;
    }

}
