package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
       //100 e kadar olan sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        while (sayac<=100) //veya (i<=100) de olabilir <=buradaki eşittir istenilen sayı dahilse eğer kullanılıyo
        {
            toplam=toplam+sayac;  //sayı giriniz deseydi sout yapardık..

            sayac++; //****(i++; ya da toplam=toplam+i de aynı oluyor buradaki i de sayac manasında.)****

        }
        System.out.println("toplam = " + toplam);


    }
}
