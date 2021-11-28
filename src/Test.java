import Util.Utilitaire;
import Util.UtilitaireImpl;
import Util.UtilitaireImpl2;

public class Test {
    public static void main(String[] args) {
        Utilitaire utilitaire=new UtilitaireImpl();
        System.out.println(utilitaire.compute("azerty"));
        utilitaire=new UtilitaireImpl2();
        System.out.println(utilitaire.compute("azerty"));
    }
}
