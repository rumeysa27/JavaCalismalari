package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Rümeysa Bakır" R.B şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve soyadınız");
        String adSoyad=oku.nextLine(); // adSoyad veri olarak alındı

        // Rümeysa Bakır -> R.B  ->R -> charAt(0) R.
        // indexOf (" ") -> boşluğun indexini veriyor, bunun 1 fazlası charAt() -> B yi verir

        char ilkHarf=adSoyad.charAt(0); // R
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1); // B

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");




    }
}
