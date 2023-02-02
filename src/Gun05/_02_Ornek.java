package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.
        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Adınızı giriniz:");
        String ad = okuyucu.next(); // next() bir kelime okur.

        System.out.println("Girilen ad : " + ad);
        /*
          okuyucu.next();     -> bir kelime okur
          okuyucu.nextLine(); -> satırın tümünü okur

          okuyucu.nextInt();  -> int değeri okumak için
          okuyucu.nextShort();  -> short değeri okuma için
          okuyucu.nextByte();   -> byte değeri okumak için
          okuyucu.nextLong();   -> long değeri okumak için

          okuyucu.nextFloat();  -> float değeri okuma için
          okuyucu.nextDouble(); -> doublem değeri okuma için

          okuyucu.nextBoolean();-> true veya false girişi için
        */


    }
}
