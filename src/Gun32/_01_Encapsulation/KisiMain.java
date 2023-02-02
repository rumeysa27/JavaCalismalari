package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();
        //kisi1.ad="rümeysa";
        //kisi1.soyad="bakır";
        //kisi1.yas=-28; diğer clasa yasın başına private eklediğimiz için buraya hata verdi çünkü erişimi engellendi
        kisi1.setAd("rümeysa");
        kisi1.setSoyad("bakır");
        kisi1.yasAta(-28);

        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());
        System.out.println("kisi1= "+kisi1);
        //değişkene direkt erişimi kapatıp bir metod ile korumalı veri gönderme ve alma işlemine Encapsulation denr

    }
}
