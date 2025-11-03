package Teht3;
import java.util.Scanner;

public class Paaohjelma2 {
     public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
    Tiskikone Ohjelma1=new Tiskikone();
    Tiskikone Ohjelma2=new Tiskikone();

    System.out.println("Anna ID (numero)");
    Ohjelma1.setId(scan.nextInt());
    scan.nextLine();

    System.out.println("Anna merkki");
    Ohjelma1.setMerkki(scan.nextLine());

    System.out.println("Anna malli");
    Ohjelma1.setMalli(scan.nextLine());

    System.out.println("Anna pesuohjelma (numero)");
    Ohjelma1.setPesuohjelma(scan.nextInt());



    Ohjelma1.Tiedot();

     }
}
