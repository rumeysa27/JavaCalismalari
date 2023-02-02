package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        //bir kamppus programı için aşağıdaki özellikte bilgilerin kaydedileceği clasları yazınız.
        //okul: adı, mudurAdi, ucreti(double) ->tip
        //ogrenci: okulNo, tamAd, okulu-> Tip

        //bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Rümeysa Bakır";

        //1.yöntem
        ogr.okulu=new Okul();
        ogr.okulu.adi="30 Ağustos okulu";
        ogr.okulu.mudurAdi="Behzat Kazak";
        ogr.okulu.ucreti=5000;

        //2.yöntem
        Okul ok=new Okul();
        ok.adi="30 Ağustos";
        ok.mudurAdi="Behzat Kazak";
        ok.ucreti=5000;
        ogr.okulu=ok;

        System.out.println("okulNo= "+ogr.okulNo);
        System.out.println("tamAd= "+ogr.tamAd);
        System.out.println("okul ad= "+ogr.okulu.adi);
        System.out.println("mudurAdi= "+ogr.okulu.mudurAdi);
        System.out.println("ucreti= " +ogr.okulu.ucreti);









    }
}
