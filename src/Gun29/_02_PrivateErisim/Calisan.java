package Gun29._02_PrivateErisim;

public class Calisan {
    //BURADA SADECE İNT, STRİNG  VAR YANİ BAŞLARINDA PUBLİC STATİC GİBİ BİR "BELİRTEÇ" YOK BÖYLE OLDUĞU İÇİN BU DEFAULT
    //YANİ DEMEK OLUYOR Kİ BAŞKA PAKETLERDEN ERİŞİM YAPILAMAZ PAKETİN İÇİNDEKİLER ERİŞEBİLİR SADECE
    //DİĞER PAKETLERDEN ERİŞİM YOK
      int id;//default
    String name; //default
    String surname;//default
   private String password; // //başına private ekleyince erişim engellendi sadece bulunduğu classdan erişim izni var

    public void sifreAta(String sifre){//bu parametrede şifre yazıyor ondan altta password=şifre oldu password türünden manasında
        //sifreyi kontrol ederek atıyor
        if (sifre.length()<8){
            System.out.println("zayıf şifre:");
        }
        else {
           this.password=sifre; //yani password türünden şifre
            System.out.println("Şifre başarıyla atandı:");
        }
    }
    public void sifreGoster(){
        System.out.println("****"+password.substring(4));
    }


}
