package Teht5;

public class Viila {
    private int id;
    private int karkeus;
    private String valmistaja;

    public Viila() {
        this.id = 0;
        this.karkeus = 0;
        this.valmistaja = "";
    }
    public Viila(int id, int karkeus, String valmistaja) {
        this.id = id;
        this.karkeus = karkeus;
        this.valmistaja = valmistaja;
    }
    public int getId() {
        return id;
    }
        public void setId(String id) {
        try {
            this.id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("Virheellinen id-arvo: " + id);
        }
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getKarkeus() {
        return karkeus;
    }
    public void setKarkeus(int karkeus) {
        this.karkeus = karkeus;
    }
        public void setKarkeus(String karkeus) {
        try {
            this.karkeus = Integer.parseInt(karkeus);
        } catch (NumberFormatException e) {
            System.out.println("Virheellinen karkeus-arvo: " + karkeus);
        }
    }
    public String getValmistaja() {
        return valmistaja;
    }
    public void setValmistaja(String valmistaja) {
        this.valmistaja = valmistaja;
    }
        public String toString() {
        return "Viila ID: " + id + ", karkeus: " + karkeus + ", valmistaja: " + valmistaja;
    }
}
