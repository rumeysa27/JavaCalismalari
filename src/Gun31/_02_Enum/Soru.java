package Gun31._02_Enum;

public class Soru {
   // enum Role{ADMIN,MUDUR,SATIS,PERSONEL,TESTER} BUNLARI BÖYLE DE YAPABİLİRSİN CLASS AÇMA YERİNDEN DİREKT ENUMU SEÇEREK
  //  enum Statu{AKTIF,PASIF} İKİ AYRI ENUM CLASSINA ROLE VE STATU İSMİ İLE CLASS AÇARAKTA TANIMLAYABİLİRSİN.
    //MAİN KALABALIK OLMASIN DİYE AYRI YERE TANIMLADIK

    public static void main(String[] args) {
        User user1=new User("Rümeysa", Role.ADMIN, Statu.AKTIF);
        User user2=new User("seda", Role.MUDUR, Statu.PASIF);
        User user3=new User("Ali", Role.SATIS,Statu.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        System.out.println("user1= "+user1);

    }
    public static void userSil(User user){ //user cinsinden user yani
        if (user.role==Role.ADMIN){
            System.out.println(user.username +"Admin silinemez");
        }
    }

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

}
