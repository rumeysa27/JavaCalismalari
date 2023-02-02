package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
       //soru: girilen sayın 50 den büyük ise 1, değilse 0 değerini ekrana yazdırınız.
        // ternary operatör ile yapınız

        Scanner oku=new Scanner(System.in);
        System.out.print( "sayi=");
        int sayi=oku.nextInt();

        System.out.println(  (sayi>50) ? "1"   : "0");

        //ikinci yöntem //yukarıdaki scanneri int i yazmayı unutma herhangi başka bir soruda
        int sonuc=(sayi>50) ? 1: 0;
        System.out.println("sonuc = " + sonuc);







    }
}
