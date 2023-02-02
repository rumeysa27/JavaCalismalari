package Gun34._03_Ornek;

// 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
// 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans String
// 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  String
// 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
// 5- Oluşturuken her öğrenciye, İlk ve Lise
          // öğrencileri her birisi kendi
                 //  içinde ayrı tanımlanmış bir sayaçtan no veriniz
public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Rümeysa Bakır", OgrTip.LISE,"Sayısal");
        LiseOgrencisi lo2=new LiseOgrencisi("Aylin Korkmaz", OgrTip.LISE,"sözel");
        IlkOgrencisi io=new IlkOgrencisi("Yusuf Yılmaz", OgrTip.ILK,"satranç");

        System.out.println("lo1 = "+ lo1);
        System.out.println("lo2 = "+ lo2);
        System.out.println("io = "+ io);
        
    }
}
