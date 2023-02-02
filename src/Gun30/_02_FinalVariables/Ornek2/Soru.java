package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {// Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int gun=0;
        int saat=0;
        int dakika=0;
        System.out.print("Gun="); gun=oku.nextInt();
        System.out.print("Saat="); saat=oku.nextInt();
        System.out.print("Dakika="); dakika=oku.nextInt();

        int toplamSaniye=
                gun
                        *Sabitler.birGundekiSaatSayisi
                *Sabitler.birSaaattekiDakikaSayisi
                *Sabitler.birDakikadakiSaniyeSayisi
               +
                saat
                *Sabitler.birSaaattekiDakikaSayisi
                *Sabitler.birDakikadakiSaniyeSayisi
                +dakika
                *Sabitler.birDakikadakiSaniyeSayisi;
        System.out.println("toplamSaniye= "+toplamSaniye);

        //2.Yöntem:
        System.out.println("toplamSaniye ="
        +Sabitler.hesapla(gun,saat,dakika));
    }
}
