package Teht6;

import java.util.ArrayList;
import java.util.Scanner;

import Teht5.Kala;

public class KalaOhjelma {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Kala> lista = new ArrayList<>();                //Luodaan lista (tämä toistuu kunnes muin sanotaan)

        do {
            Kala k = new Kala();              //Luodaan uusi kala nimeltä k
            KysyKalanTiedot(k);                      //kysytään kalan tiedot
            lista.add(k);                        //Lisataan kala listaan
        } while (kysy("Lisätäänkö uusi kala? (k/e)").equalsIgnoreCase("k"));        //Kysytään halutaanko lisätä uusi kala
        tulostaKalat(lista);
    }
    public static void KysyKalanTiedot(Kala k) {        //Kalan parametrit nappaimistolta
        k.setId(kysy("Anna kalan id: "));
        k.setLaji(kysy("Anna kalan laji: "));
        if (!k.setPaino(kysy("Anna kalan paino: ")))           //Jos ei anneta painoa niin tulos 0
        System.out.println("Asennetaan paino 0.");
    }
    public static String kysy(String tiedot) {                      //tulostaa vastaukset näppäimistöltä
        System.out.print(tiedot);
        return sc.nextLine().trim();
    }
    public static void tulostaKalat(ArrayList<Kala> lista) {
        System.out.println("--Kaikki kalat--");                //tulostetaan peini titteli
        lista.forEach(System.out::println);                //tulostaa koko listan
    }
}
