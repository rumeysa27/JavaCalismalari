package Gun34._02_Ornek;

public class IlkOgrencisi extends Ogrenci{
    private  String klup;
    public IlkOgrencisi(String isim, OgrTip tipi, String klup) {
        super(isim, tipi);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}
