package Gun08;

import java.util.Scanner;
public class _07_Soru {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayının birbirine eşit  olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("Birinci sayi=");
        int sayi1=oku.nextInt();

        System.out.println("ikinci sayi=");
        int sayi2=oku.nextInt();

        System.out.println("Eşit mi? " + (sayi1==sayi2));

        //2.Yöntem
        boolean esitMi= (sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);



    }
}
