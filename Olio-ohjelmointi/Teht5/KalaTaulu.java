package Teht5;

import java.util.Scanner;

public class KalaTaulu {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kala[] taulu = new Kala[3];

        for(int i= 0; i < taulu.length; i++) {
            taulu[i] =new Kala();
            System.out.println("Anna kalan tiedot" + (i + 1) + ":");
            lueKalanTiedot(taulu[i], input);
            System.out.println();
        }

        tulostaKalat(taulu);

        input.close();
    }

    private static void lueKalanTiedot(Kala kala, Scanner input) {

        System.out.print("Anna kalan id");
        String id =input.nextLine();
        kala.setId(id);
    

        System.out.print("Anna kalan laji");
        String laji =input.nextLine();
        kala.setLaji(laji);

        System.out.print("Anna kalan paino");
        String paino =input.nextLine();
        if (!kala.setPaino(paino)) {
            System.out.println("Virheellinen paino");
        }
    }


	private static void tulostaKalat(Kala[] taulu) {
		for (int i=0;i<taulu.length;i++) {
			System.out.println(taulu[i]);
		}
	}

}