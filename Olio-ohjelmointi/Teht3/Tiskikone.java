package Teht3;

    public class Tiskikone {

    private int id;
   private String merkki;
   private String malli;
   private int pesuohjelma;

   public int getId() {
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public String getMerkki() {
    return merkki;
   }
   public void setMerkki(String merkki) {
    this.merkki = merkki;
   }
   public String getMalli() {
    return malli;
   }
   public void setMalli(String malli) {
    this.malli = malli;
   }
   public int getPesuohjelma() {
    return pesuohjelma;
   }
   public void setPesuohjelma(int pesuohjelma) {
    this.pesuohjelma = pesuohjelma;
   }

    public void Tiedot() {
        System.out.println(id);
        System.out.println(merkki);
        System.out.println(malli);
        System.out.println(pesuohjelma);
    }
}


