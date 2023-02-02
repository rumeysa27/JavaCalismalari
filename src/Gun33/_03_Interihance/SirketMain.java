package Gun33._03_Interihance;

public class SirketMain {
   // Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
    //consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
    //GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
    //GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
    //SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
    //maaşları hesaplatıp, bordroyu yazdırınız.
   public static void main(String[] args) {

       Calisan clsn1=new Calisan("rümeysa",40000,1.5);
       System.out.println("clsn1= "+clsn1);
       GenelMudur gm1=new GenelMudur("sevda",55000,1.8,1000);
       System.out.println("gm1= "+gm1);
   }
}
