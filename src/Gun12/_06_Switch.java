package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //girilen bir sayının birler basamağının değerini yazı ile yazdırınız.

        //234 -> birler basamağı -> 4
        //234 % 10 -> 4 -> dört

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi gir= ");
        int sayi=oku.nextInt();

        int birlerBasamağı= sayi % 10; //4 modül(%) her zaman kalanı verir
        // (birler basamağını istiyorsa modülü her zaman 10a böler)

        switch (birlerBasamağı)
        {
            case 0 : System.out.println("sıfır"); break;
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("üç"); break;
            case 4 : System.out.println("dört"); break;
            case 5 : System.out.println("beş"); break;
            case 6 : System.out.println("altı"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("sekiz"); break;
            case 9 : System.out.println("dokuz"); break;
        }

        //kural bir sayıdan herhangi bir rakamı almak istiyorsan:
        //istediğin rakam sonda kalcak şekilde böl, sonrada modül 10 al



    }
}
