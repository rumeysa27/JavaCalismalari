package Gun32._03_Encapsulation;

public class Ogrenci {
    private int ID;
    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci(int ID, String ad, String soyad, int yas) {
        this.ID = ID;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    static  int sayacID=1;
    public Ogrenci(String ad, String soyad,int yas){
        setID(sayacID++);
        setAd(ad);

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public String getAd() {

        return ad;
    }

    public void setAd(String ad) {

        this.ad = ad;
    }

    public String getSoyad() {

        return soyad;
    }

    public void setSoyad(String soyad) {

        this.soyad = soyad;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {

        this.yas = yas;
    }

    public static int getSayacID() {

        return sayacID;
    }

    public static void setSayacID(int sayacID) {

        Ogrenci.sayacID = sayacID;
    }
}
