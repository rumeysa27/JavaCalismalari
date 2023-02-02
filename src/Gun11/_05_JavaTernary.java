package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //soru: girilen bir sayının sıfır mı, negatif mi, pozitif mi olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz=");
        int sayi=oku.nextInt();

        System.out.println( sayi==0 ? "sıfır" : (sayi>0 ? "pozitif" : "negatif")); //(soru işareti if yani pozitifin
        // :işareti de else yani negatifin)






    }
}
