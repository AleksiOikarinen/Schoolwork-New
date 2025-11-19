package Teht5;

import java.util.ArrayList;
import java.util.Scanner;

public class KalaOhjelma {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Kala> lista = new ArrayList<>();

        do {
            Kala k = new Kala();
            KysyKalanTiedot(k);
            lista.add(k);
        } while (kysy("Lisätäänkö uusi kala? (k/e)").equalsIgnoreCase("k"));
        tulostaKalat(lista);
    }
    public static void KysyKalanTiedot(Kala k) {
        k.setId(kysy("Anna kalan id: "));
        k.setLaji(kysy("Anna kalan laji: "));
        if (!k.setPaino(kysy("Anna kalan paino: ")))
        System.out.println("Asennetaan paino 0.");
    }
    public static String kysy(String teksti) {
        System.out.print(teksti);
        return sc.nextLine().trim();
    }
    public static void tulostaKalat(ArrayList<Kala> lista) {
        System.out.println("--Kaikki kalat--");
        lista.forEach(System.out::println);
    }
}
