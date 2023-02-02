package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        //günün sorusu:3x2lik bir diziyi kullanıcıdan sayı alarak doldurduktan sonra sadece tek elemanlarını tek
        //boyutlu bir diziye atayınız.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[3][2];

        //okuma işlemi;
        int tekMiktar=0;
        for (int satir= 0; satir< tablo.length; satir++){

            for (int sutun= 0;sutun<tablo[satir].length;sutun++) {
                System.out.print("Sayi giriniz=");
                tablo[satir][sutun]=oku.nextInt();

                if (tablo[satir][sutun]%2 !=0)
                    tekMiktar++;
            }
        }
        int[]teklerDizisi=new int[tekMiktar];//teklerin miktarı kadar bir dizi tanımlandı

        tekMiktar=0;
        for (int satir= 0;satir< tablo.length;satir++){

            for (int sutun=0; sutun <tablo[satir].length; sutun++){
                if (tablo[satir][sutun]%2 !=0){
                    teklerDizisi[tekMiktar]=tablo[satir][sutun];
                    tekMiktar++;
                }
            }
        }
        System.out.println(Arrays.toString(teklerDizisi));


    }
}