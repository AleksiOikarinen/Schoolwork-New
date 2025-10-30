public class Virtapankki {
   private int varaus;
   private String merkki;
   private float paino;
   private int leveys;
   private int korkeus;
   private int paksuus;

   public Virtapankki() {
   }

   public int getVaraus() {
      return this.varaus;
   }

   public void setVaraus(int varaus) {
      this.varaus = varaus;
   }

   public String getMerkki() {
      return this.merkki;
   }

   public void setMerkki(String merkki) {
      this.merkki = merkki;
   }

   public float getPaino() {
      return this.paino;
   }

   public void setPaino(float paino) {
      this.paino = paino;
   }

   public int getKorkeus() {
      return this.korkeus;
   }

   public void setKorkeus(int korkeus) {
      this.korkeus = korkeus;
   }

   public int getPaksuus() {
      return this.paksuus;
   }

   public void setPaksuus(int paksuus) {
      this.paksuus = paksuus;
   }

   public int getLeveys() {
    return leveys;
   }

   public void setLeveys(int leveys) {
    this.leveys = leveys;
   }
    public void Tiedot() {
        System.out.println(varaus);
        System.out.println(merkki);
        System.out.println(paino);
        System.out.println(leveys);
        System.out.println(korkeus);
        System.out.println(paksuus);
    }
}