


public class Frazione implements Numero {

    private int num, den;

    public Frazione(int num, int den) {
        this.num = num;
        this.den = den;
    }

    //Override dei metodi
    @Override
    public void somma(Numero altro) {

        //downcasting
        Frazione f = (Frazione) altro;

        int d = mcm(this.den, f.getDen());
        int n = d / this.den * this.num + d / f.getDen() * f.getNum();

        this.den = d;
        this.num = n;


    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    

    private int MDC(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private int mcm(int a, int b) {
        return a * b / MDC(a, b);
    }

    @Override
    public void sottrai(Numero altro) {
        Frazione f = (Frazione)altro;

        //per sottrare cambio il segno al numeratore
        somma(new Frazione(-f.getNum(), f.getDen()));
    }

    @Override
    public void moltiplica(Numero altro) {
        Frazione f = (Frazione)altro;
        this.den *= f.getDen();
        this.num *= f.getNum();
    }

    //getter e setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

}
