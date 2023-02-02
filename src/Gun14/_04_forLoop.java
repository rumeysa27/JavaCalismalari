package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //kullanıcının gireceği bir rakama dahil sayıların toplamını bulunuz.
        // ***(Dahil) dediği için / <= / dicez yani hem eşit hem küçük olabilir manasında***
        //kullanıcının gireceği rakam dediği için scanner kullanacağız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi=oku.nextInt();

        int toplam=0;
        for (int i=1; i<= sayi; i++)
            toplam=toplam+i; //toplam+i; kısa yazılışı

        System.out.println("toplam= " + toplam);





    }
}
