public abstract class CorpoCeleste {
    
    
    protected String nome;
    protected double distanzaStella, massa, raggio;

    // costante gravitazione universale

    public double G = 6.67408e-11;
    
    public  CorpoCeleste(String nome, double distanza, double massa, double raggio) {
        this.nome = nome;
        this.distanzaStella = distanza;
        this.massa = massa;
        this.raggio = raggio;
    }

    public String getNome() {
        return nome;
    }

    public double getDistanzaStella() {
        return distanzaStella;
    }

    // impossibile da cambiare
    public final double getGravita(){
        return G * this.massa / Math.pow(raggio, 2);
    }

    
    


}
