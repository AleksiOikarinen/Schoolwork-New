package Teht7;

import java.util.Scanner;

public class MoponNopeus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mopo mopo = new Mopo();
        mopo.setMoottorimerkki("Sachs");
        mopo.setTyyppi("Enduro");
        mopo.setHinta(1200);
        mopo.setVari("Vihreä");
        mopo.setMaksimiNopeus(100);
        mopo.setNopeus(12); // Alku niopeus

        while (true) {
            System.out.println("\nMopon " + mopo.getMoottorimerkki() + " nopeus on " + mopo.getNopeus());
            System.out.println("h=Hidasta");
            System.out.println("k=Kiihdytä");
            System.out.print("Valinta: ");
            String valinta = sc.nextLine().trim().toLowerCase();

            if (valinta.equals("k")) {
                System.out.print("Kiihdytys määrä ");
                int lisays = Integer.parseInt(sc.nextLine());
                mopo.kiihdyta(lisays);
            } else if (valinta.equals("h")) {
                System.out.print("Hidastus määrä ");
                int vahennys = Integer.parseInt(sc.nextLine());
                mopo.hidasta(vahennys);
            } else {
                System.out.println("Virhe (k/h)");
            }

            // Tulostaa tiedot
            System.out.println("Mopon " + mopo.getMoottorimerkki() + " nopeus on " + mopo.getNopeus());
        }
    }
}

