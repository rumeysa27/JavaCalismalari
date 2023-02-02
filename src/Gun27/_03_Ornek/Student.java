package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;

    int maxSaat;

    ArrayList<Lesson> dersleri=new ArrayList<>();//burada da olabilir kısa yöntem

    public void dersEkle(Lesson ders){
        int suanToplamSaat=0;
        for (Lesson d: dersleri)
            suanToplamSaat+=d.saat;
        if (suanToplamSaat+ders.saat<=maxSaat)
        dersleri.add(ders);
        else
            System.out.println(ders.name+ ": Kredi sınırı aşıldı. Yeni ders eklenememektedir."+
                    "Eklenemeyen ders:"+ders.name);
    }
   public void dersleriYazdir(){
       System.out.println("\n*** Transkript ***");
       System.out.println("Sayın "+name);
       System.out.println("Aldığınız dersler aşağıdadır: ");
       for (Lesson d: dersleri)//lesson cinsinden d yani buradaki d derslerin referansı
           System.out.println(d.name+" "+d.saat);

    }
    public static void universiteKurallari(){
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık önemli");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol");
        System.out.println("Kural 4: Yılma ayakta kal sen yaparsın");
    }
}
