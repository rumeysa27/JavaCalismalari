package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) { //static sabit, zaten var manasına geliyor
        //static kelimesi olan metodlar sınıfa ait direk çağırabildiğimiz için (classa yani tipe ait)
        //satitic olmayan metodlar nesneye ait bu sebeple mutlaka oluşturulması gerekiyor
        //bir metod her zaman kullanacağımız metodlarsa bunlar sınıfa aittir yani kendi başına çalışacak metodları
        //geneli ilgilendireni static kullanıyoruz, nesneyi ilgilendireni static kullanmıyoruz.
        //static metodlar zaten var oldukları için new ile yeni oluştrulmaya ihtiyaç duymazlar
        //kısacası metod static olunca direkt çalışıyor static olmayınca new tanımlamak gerekiyor
        //mesela  insan class rümeysa nesne
        int sayi=345;
        String strSayi=String.valueOf(sayi); //nesne oluşturmadan valueOf direkt çağrıldı çünkü static koyduk
        int insSayi= Integer.parseInt(strSayi);

        Utility ut=new Utility();//burada new dediğimiz zaman oluşuyor metod, newi tanımlayınca
        String strSayi2= ut.getString(sayi);

        String strSayi3= Utility.getString2(sayi);






    }
}
