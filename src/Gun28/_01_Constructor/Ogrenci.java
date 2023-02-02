package Gun28._01_Constructor;

public class Ogrenci {
    int id;

    String ad;

    String soyad;

    int sinifi;

    Ogrenci(){ //ilk oluşma anında çalışan metodlara (Yapıcı metodlar/Constructor)denir
        System.out.println("nesne oluşturuldu");//nesne oluşturulurken yapmak istediklerin için burayı kullan
    }

    //eğer parametre değişirse yenisini eklicez
    Ogrenci(int id, String ad, String soyad,int sinifi){
        this.id=id; //yani this kullanarak buranın id si, buranın adı  demiş olduk net belirttik karışmasın diye
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;
    }
    public Ogrenci(int id, String ad, String soyad){ //kısa yol
        this(id,ad,soyad,0); //this dediği için burada metod olarak öğrenciyi kastettiğini anlıyor
        //yani öğrenci metodunun kendisi..

        // this.id=id;
       // this.ad=ad;
       // this.soyad=soyad;
       // this.sinifi=0;



    }
}
