package Gun38._01_Abstract;

public  abstract class  BinekOto { //abstract ikisi bi arada bir interface bir parent class olacaksa abstract
    //eğer bir tane interface gerekliyse class interface classı  açmadan abstract yapıyoruz

    private String marka;
    private int uretimYili;
    private int vitesAdeti;

    public BinekOto(String marka, int uretimYili, int vitesAdeti) {
       setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdeti(vitesAdeti);
    }
    abstract int HizlanmaSuresi();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdeti() {
        return vitesAdeti;
    }

    public void setVitesAdeti(int vitesAdeti) {
        this.vitesAdeti = vitesAdeti;
    }
}
