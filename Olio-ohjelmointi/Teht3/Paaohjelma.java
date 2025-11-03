package Teht3;

public class Paaohjelma {
     public static void main(String[] args) throws Exception {

    Tiskikone Ohjelma1=new Tiskikone();
    Tiskikone Ohjelma2=new Tiskikone();

    Ohjelma1.setId(10);
    Ohjelma1.setMalli("Mahru");
    Ohjelma1.setMerkki("samsum");
    Ohjelma1.setPesuohjelma(2);

    Ohjelma2.setId(20);
    Ohjelma2.setMalli("Mahku");
    Ohjelma2.setMerkki("simsam");
    Ohjelma2.setPesuohjelma(20);


    Ohjelma1.Tiedot();
    Ohjelma2.Tiedot();
     }
}
