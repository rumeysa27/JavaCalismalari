package Gun32._03_Encapsulation;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("kabataş Okulu",3); //maxOgr3

        do {
            System.out.print("Öğrenci Adı="); String ad=okuStr.nextLine();
            System.out.print("Öğrenci soyadı="); String soyad=okuStr.nextLine();
            System.out.print("Öğrenci yaşı="); int yas=okuInt.nextInt();
            if (yas < 15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);
            }else {
                System.out.println("Öğrenci yaşı okul için uygun değil");
            }

        }while (yeniOkul.getOgrenciler().size()<yeniOkul.getKontenjan() );
        System.out.println("Öğrenciler = "+yeniOkul.getOgrenciler());
    }
}
