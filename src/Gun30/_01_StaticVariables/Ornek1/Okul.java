package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
        //        Ogrenci ogr1=new Ogrenci("ismet","Temur","Yıldırım Ilkokulu");
//        Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım Ilkokulu");
//        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım Ilkokulu");
//
//
//        // ...
//        //...
//        Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım Ilkokulu");
//        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım Ilkokulu");

        Ogrenci ogr1=new Ogrenci("Rümeysa", "Bakır");
        System.out.println("ogr1= "+ogr1);

        Ogrenci.okulAd="30 Ağustos okulu";
        System.out.println("ogr1 tekrar= "+ogr1);

        Ogrenci ogr2=new Ogrenci("selim","dündar");
        System.out.println("ogr2= "+ogr2);
// Aynı verinin çok kez girişi engellendi
        //aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi
    }
}
