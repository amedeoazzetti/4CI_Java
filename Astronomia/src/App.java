public class App {

    public static void main(String[] args) throws Exception {
        Pianeta p1 = new Pianeta("Mercurio", 5.7909175e10, 3.33e23, 2.43965e6);
        Pianeta p2 = new Pianeta("Venere", 1.08208930e11, 4.869e24, 6.05159e6);
        Pianeta p3 = new Pianeta("Terra", 1.49598262e11, 5.97219e24, 6.372797e6);
        Pianeta p4 = new Pianeta("Marte", 2.2793664e11, 6.4191e23, 3.397e6);
        Pianeta p5 = new Pianeta("Giove", 7.7841201e11, 1.8987e27, 7.149268e7);
        Pianeta p6 = new Pianeta("Saturno", 1.4267254e12, 5.6851e26, 6.026714e7);
        Pianeta p7 = new Pianeta("Urano", 2.8709722e12, 8.6849e25, 2.555725e7);
        Pianeta p8 = new Pianeta("Nettuno", 4.4982529e12, 1.0244e26, 2.476636e7);
        Pianeta p9 = new Pianeta("Plutone", 5.90638e12, 1.3105e22, 1.184e6);

        Stella sole = new Stella("Sole", 1.989e30, 6.9634e8);

        Sistema sistema = new Sistema();
        sistema.aggiungiPianeta(p1);
        sistema.aggiungiPianeta(sole);
        sistema.aggiungiPianeta(p2);
        sistema.aggiungiPianeta(p3);
        sistema.aggiungiPianeta(p4);
        sistema.aggiungiPianeta(p5);
        sistema.aggiungiPianeta(p6);
        sistema.aggiungiPianeta(p7);
        sistema.aggiungiPianeta(p8);
        sistema.aggiungiPianeta(p9);
        
        System.out.println(sistema.contaStelle());

        System.out.println("-----------------------");

        System.out.println(sistema.pianetiConsecutivi());

        System.out.println("-----------------------");

        System.out.println(sistema.pianetiOrdinati());

        System.out.println("-----------------------");

        System.out.println(sistema.rimuoviPianeti("Urano"));
    }
}
