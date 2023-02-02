package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        int sayi=oku.nextInt();
        int kalan=sayi %2; //bu 1 e eşitse tektir.

        System.out.println("tek mi " + (kalan==1));









    }
}
