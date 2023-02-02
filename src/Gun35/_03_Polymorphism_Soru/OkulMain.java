package Gun35._03_Polymorphism_Soru;
//1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
//2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
        //3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
        //olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr= new Ogrenci("Yusuf","Dündar","Öğrenci","5/A");
        Calisan cls= new Calisan("Selda","Korkmaz","Öğretmen","Okul");

       Kisi.kimlikYaz(ogr);
       Kisi.kimlikYaz(cls);


    }


    }

