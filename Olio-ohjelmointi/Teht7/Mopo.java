package Teht7;

public class Mopo extends Kulkuneuvo {

    private String moottorimerkki;
    private String tyyppi;

    public String getMoottorimerkki() {
        return moottorimerkki;
    }
    public void setMoottorimerkki(String moottorimerkki) {
        this.moottorimerkki = moottorimerkki;
    }
    public String getTyyppi() {
        return tyyppi;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    @Override
    public String toString() {
        return "Mopo [" + moottorimerkki + ", " + tyyppi + ", " + getHinta() + ", " + getVari() + ", " + getMaksimiNopeus() + "]";
    }

}
