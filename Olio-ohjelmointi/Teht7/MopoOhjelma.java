package Teht7;

import java.util.ArrayList;

public class MopoOhjelma {
    public static void main(String[] args){
        ArrayList<Mopo> mopot = new ArrayList<>();

        Mopo m1 = new Mopo();
        Mopo m2 = new Mopo();
        m1.setMoottorimerkki("Sachs");
        m1.setTyyppi("Enduro");
        m1.setHinta(1200);
        m1.setVari("Vihreä");
        m1.setMaksimiNopeus(100);

        m2.setMoottorimerkki("Solifer");
        m2.setTyyppi("pappa");
        m2.setHinta(1600);
        m2.setVari("Sininen");
        m2.setMaksimiNopeus(120);

        mopot.add(m1);
        mopot.add(m2);
        
        for ( Mopo m : mopot) {
            System.out.println(m);
        }
    }
}
