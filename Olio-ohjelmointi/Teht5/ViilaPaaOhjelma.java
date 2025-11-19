package Teht5;

public class ViilaPaaOhjelma {
    public static void main(String[] args) {

    Viila[] taulu = new Viila[3];

    taulu[0] = new Viila();
    taulu[1] = new Viila(101, 800, "Bacho");

    taulu[2] = new Viila();
    taulu[2].setId(102);
    taulu[2].setKarkeus(200);
    taulu[2].setValmistaja("Humbuk");

    tulostaViilat(taulu);
   }
   private static void tulostaViilat(Viila[] taulu) {
    System.out.println("--Viilat--");
    for (int i = 0; i < taulu.length; i++) {
        System.out.println(taulu[i]);
     }
   }

}
