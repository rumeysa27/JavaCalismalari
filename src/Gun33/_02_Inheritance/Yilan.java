package Gun33._02_Inheritance;

public class Yilan extends Hayvan{
    private int uzunlugu;
    public Yilan(String renk, int kilo, String cinsi, int uzunlugu) {
        super(renk, kilo, cinsi);
        //veya
       setUzunlugu(uzunlugu);
    }

    @Override
    public void konustu() {
        System.out.println("tısssladıı");
    }

    public int getUzunlugu() {
        return uzunlugu;
    }
    public void setUzunlugu(int uzunlugu) {

        this.uzunlugu = uzunlugu;
    }


}
