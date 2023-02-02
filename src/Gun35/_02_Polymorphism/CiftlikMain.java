package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("golden");
        kopek1.ses();//havladı
        kopek1.kokladi();//kokladı

        Kedi kedi1=new Kedi("pamuk");
        kedi1.ses();
        kedi1.tirmaladi();

        kopekSesi(kopek1);
        kediSesi(kedi1);

        hayvanSesi(kopek1);//havladı
        hayvanSesi(kedi1);//miyavladı

        /*********************************************/
        Hayvan hayvan1=new Hayvan("ördek");//hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal");//hayvanlardan 1 köpek
        Hayvan hayvan3=new Kedi("boncuk");//hayvanlardan bir kedi

        System.out.println("-----------------------");
        hayvan1.ses();//genel hayvan ses çıkardı
        hayvan2.ses();//köpek hayvan havladı
        hayvan3.ses();//kedi hayvanı miyavladı
        System.out.println("---------------------");

        hayvan2.ses();  // kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yara mı
        ((Kopek)hayvan2).kokladi(); // artık diğer metodları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.



    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi) {
        kedi.ses();
    }
    public static void hayvanSesi(Hayvan hayvan){//
        hayvan.ses();//buraya hem kedi geliyor hem köpek  geliyor

        if (hayvan instanceof Kopek)//hayvan aslında kopek mi manasına geliyor (instanceof) kullanarak
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi)//hayvan aslında Kedi mi
            ((Kedi)hayvan).tirmaladi();



    }
    //Hayvan classından türettiğimiz-extend yaptığımız için
    //  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
    //  köpek ve kedi için classlarında Override yaparak yazdığımız
    //  özellikleri alarak yazdı.
    //  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
    //  yazdıklarımızı hayvanSesi methodunda yazdıramayız


    //POLYMORPHİSM
    //Programlara sağlamış olduğu esneklik sayesinde farklı işlemler arasındaki bağlantı ilişkilerini azaltarak
    // daha güvenli bir hale getirir.
    //Tekrar tekrar yazılacak kod satırlarını minimum seviyeye indirerek okunabilirlik sağladığı
    // gibi gereken zamanı da azaltır.
    //Program içerisinde oluşan bir hatayı tek bir yapı içerisinde çözme kolaylığı sağlar.
    //Bu farklara baktığımız zaman temel eylem yapıları aynı olarak görünse bile
    // birden fazla farka ev sahipliği yapabiliyor (çok biçimlilik)
    //çok biçimli bir yapı inşa etmek istediğimiz zaman kullancaz bunu
}
