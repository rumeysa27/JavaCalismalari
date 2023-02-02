package Gun06;

//Kullanıcıdan Cadde, Sokak, PostaKodu(int) ve ülke şeklinde
//adres bilgisi alarak yazdırınız.

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);


        System.out.print("Cadde=");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak=");
        String sokak=okuStr.nextLine(); //"45554"

        System.out.print("Posta Kodu=");
        int  postaKodu=okuInt.nextInt();

        System.out.print ("Ulke=");
        String ulke=okuStr.nextLine();

        System.out.println("Adres=" +cadde+" "+sokak+" "+postaKodu+" "+ulke);





    }
}
