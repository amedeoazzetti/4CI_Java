public class App {
    public static void main(String[] args) throws Exception {

        Frazione f1 = new Frazione(2, 5);
        Frazione f2 = new Frazione(3, 4);

        f1.somma(f2);
        System.out.println(f1.toString());

        Complesso c1 = new Complesso(3, 3);
        Complesso c2 = new Complesso(2, 4.5);

        c1.somma(c2);
        System.out.println(c1.toString());

        Numero n1 = new Frazione(2, 3);
        Numero n2 = new Frazione(2, 3);

    }
}
