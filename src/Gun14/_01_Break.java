package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
      //girilen bir sayının ,aynı 2 sayının çarpımına eşit olup olmadığını bulunuz.

        //4 girdim ->bu tam karedir(2*2)aynı iki tane sayının çarpımına eşit ise TAM KARE oluyor.
        //5 girdim-> tam kare değldir
        //9 girdim ->(3*3) tam karedir

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi=oku.nextInt();

        //5 girildi, 5e kadar sayıları 1,2,3,4
        //9 girildi, 9a kadar sayıları 1,2,3,4,5,6,7,8

        int sayac=0;
        int arananRakam=0; //ikinci yöntem boolean=false;
        while(sayac<sayi)
        {
            if (sayac*sayac==sayi) //0*0==
            {   //tamKare=true ikinci yöntem devamı
                System.out.print("tam karedir");
                break; //çalıştığında döngüden çıkar
            }

            sayac++;
        }
        if (arananRakam==0)  //if (tamKare == false ikinci yöntem devamı
            System.out.println("tam kare değildiir");


    }
}
