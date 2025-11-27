package Teht7;



public class Kulkuneuvo {
	private int hinta;
	private String vari;
	private int maksimiNopeus;
    private int nopeus;
	
	public int getHinta() {
		return hinta;
	}
	public void setHinta(int hinta) {
		this.hinta = hinta;
	}
	public String getVari() {
		return vari;
	}
	public void setVari(String vari) {
		this.vari = vari;
	}
	public int getMaksimiNopeus() {
		return maksimiNopeus;
	}
	public void setMaksimiNopeus(int maksimiNopeus) {
		this.maksimiNopeus = maksimiNopeus;
	}
    public int getNopeus() {
        return nopeus;
    }
    public void setNopeus(int nopeus) {
        if (nopeus < 0){
            this.nopeus = 0;
        } else if (nopeus > maksimiNopeus) {
            this.nopeus = maksimiNopeus;
        } else {
        this.nopeus = nopeus;
    }
    }
    public void kiihdyta(int lisays) {
        setNopeus(this.nopeus + lisays);
    }
    public void hidasta(int vahennys) {
        setNopeus(this.nopeus - vahennys);
    }
}