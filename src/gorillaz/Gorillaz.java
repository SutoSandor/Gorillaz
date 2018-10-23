package gorillaz;

/**
 *
 * @author soola
 */
public class Gorillaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gorillak gorillak = new Gorillak("gorilla.txt");
        System.out.println(gorillak.HanyNosteny()+" nőstény van az állombányban!");
        System.out.println("A hím gorilláknak összesen " +gorillak.HimekKolykeinekSzama() + " kölyke van.");
        gorillak.RendezesEletkorNov();
        gorillak.GorillaListaKiir();
        System.out.println("-----------------------------");
        gorillak.Parositas();
        gorillak.FajlbaIr();
    }
    
}
