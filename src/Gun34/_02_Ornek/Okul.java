package Gun34._02_Ornek;
// 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
// 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
// 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
// 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
// 5- Oluşturuken her öğrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz
public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Rümeysa Bakır",OgrTip.LISE,"Sayısal");
        LiseOgrencisi lo2=new LiseOgrencisi("Aylin Korkmaz",OgrTip.LISE,"sözel");
        IlkOgrencisi io=new IlkOgrencisi("Yusuf Yılmaz",OgrTip.ILK,"satranç");

        System.out.println("lo1 = "+ lo1);
        System.out.println("lo2 = "+ lo2);
        System.out.println("io = "+ io);

    }
}
