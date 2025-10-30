public class Tulostin {
    public static void main(String[] args) throws Exception {
            //Virtapankki
        Virtapankki Virtapankki=new Virtapankki();

        Virtapankki.setVaraus(90);
        Virtapankki.setMerkki("Huawei");
        Virtapankki.setKorkeus(20);
        Virtapankki.setPaino(8432);
        Virtapankki.setPaksuus(20);

        System.out.println(Virtapankki.getVaraus());


            //PaperiArkki

        PaperiArkki Paperi=new PaperiArkki();

        Paperi.setKoko("A4");
        Paperi.setPaino(5);
        Paperi.setSisalto("Olipa kerran...");

        System.out.println(Paperi.getSisalto());
        
    }
}