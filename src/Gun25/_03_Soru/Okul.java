package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<Ogrenci> snf=new ArrayList<>();
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        for (int i=0; i<3; i++){

            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci Adı="); ogr.adi=okuStr.nextLine();
            System.out.print("Öğrenci SoyAdı="); ogr.soyAdi=okuStr.nextLine();
            System.out.print("Öğrenci Sinifi="); ogr.sinifi=okuInt.nextInt();
            System.out.print("Öğrenci Adresi="); ogr.adres=okuStr.nextLine();

            snf.add(ogr);
        }
        for (Ogrenci ogr: snf){ //foreach kullanıyoruz ama önce arrayListe ihtiyacımız var
            System.out.println("ogr.ad= "+ ogr.adi);
            System.out.println("ogr.SoyAdi= "+ ogr.soyAdi);
            System.out.println("ogr.sinifi= "+ ogr.sinifi);
            System.out.println("ogr.adres= "+ ogr.adres);
        }

    }
}
