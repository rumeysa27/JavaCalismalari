package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        //String'lerde neden == yerine egual kullanılıyor?

        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        //İLKEL tipleri karşılaştırdığından 2sinde de DEĞERLERİ KARŞILAŞTIRIR çünkü başka şeyi yok

        if (cumle1== cumle2)
            System.out.println("Cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit DEĞİL");

        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 cumle 2 ye eşit");

        else
            System.out.println("cumle 1 cümle 2 ye eşit değil");

        //**********REFERANS TİPLERDE ise durum*****/
        //scanner le ekrandan okuduğunda aşağıdaki gibi oluyor
        String cumle3= new String("Bügun hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if (cumle3 == cumle4)//adresleri karşılaştırır
            System.out.println("cümle 3 cümle 4e eşit");
        else
            System.out.println("cümle 3 cümle 4 e eşit değil");

        if (cumle3.equals(cumle4))//değerleri aynı mı
            System.out.println("cumle 3 cumle 4 e eşit");
        else
            System.out.println("cümle 3 cumle 4 e eşit değil");







    }
}
