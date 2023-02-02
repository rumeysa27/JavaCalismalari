package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c= new Cember();
        c.ciz();//çember çizildi

        Dikdortgen d= new Dikdortgen();
        d.ciz();//diktörtgen çizildi
        //interface lerden nesne üretilemez fakat referans tipi oluşturulabilir. bu da polymorphism kullanmamızı
        //sağladı.

        ICizdirir c2= new Cember();//direkt sadece interfacedeki isimi verilmiş metodlara erişebilirsin
        c2.ciz();//çember çizildi

        cizdirme(c);
        cizdirme(d);
    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}
