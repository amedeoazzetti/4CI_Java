public class Equip {
    private final String nome;
    private final int peso;
    private final TipoEquip tipo;

    public Equip(String nome, int peso, TipoEquip tipo) {
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public TipoEquip getTipo() {
        return tipo;
    }


}
