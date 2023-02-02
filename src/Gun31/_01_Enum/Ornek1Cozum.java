package Gun31._01_Enum;

public class Ornek1Cozum {
    enum Aylar{
      TANIMSIZ,  OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, //a.ordinal()+1 yaparsan tanmsiz yazmana gerek yok
        AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    } //ENUM mainin içine değil dışına tanımlanıyor içine tanımlanırsa hata veriyor.
    //yani sıralı tanımlamalardır. (ordinal)index olarak kullanılıyor ENUMda.
    //Yukarıda yazdığımız ayların indexi 0dan başlıyor, ocak ayı 1.ay 0.ay değil bunu böyle okuması gerekiyor
    //çünkü sıra önemli, bunun için de en başa yani 0.index e TANIMSIZ dedik

    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;
        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30); break;
        }
        if (ay== Aylar.MAYIS){
            System.out.println("zam yapıldı");
        }

        System.out.println("ay= "+ay);//toString
        System.out.println("ay.name()= "+ay.name());//SİMGE olarak kullanılan kelimeyi
        System.out.println("ay.ordinal()= "+ay.ordinal());//SİMGE nin indexini verir

        for (Aylar a: Aylar.values())
            System.out.println(a.name()+" -"+ a.ordinal());

        // Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

//bir sürü girilmesi gereken datayı  tek seferde
// parti halinde giriyoruz,daha sonra kullanması
// da kolay yazması da kolay oluyor
    }
}
