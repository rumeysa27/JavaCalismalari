package Gun19;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        tekleriBul();
        //        sayiOkuBolumu();
//        tekleriBul();
//        yazdirmaBolumu();
//
//        sayiOkuBolumu();
//        tekleriBul();
//        yazdirmaBolumu();
    }

//    sayiOkuBolumu()
//    {
//
//    }
//
//    tekleriBul()
//    {
//
//    }
//
//    yazdirmaBolumu()
//    {
//
//    }
    public static void tekleriBul(){
        Scanner oku=new Scanner(System.in);
        int sayi=0;
        int sayac=1;
        while (sayi<5){
            System.out.print("Sayıları girin:");
            int i=oku.nextInt();
            if (i %2==1)//veya %2 !=0
                sayi=sayi+1;
            sayac++;

        }
        System.out.println(sayi+" tane tek sayı bulundu");



    }
    }

