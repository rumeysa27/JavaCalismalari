package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //otopark ücretleri: 3saate kadar 10 tl, 5 saate kadar 15 tl, 5den büyükse 20 tl dir.
        //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("saati giriniz=");
        int saat=oku.nextInt();

        if  (saat<=3)
            System.out.println("ücretiniz: 10 tl dir");

        if (saat<=5   && saat>3)
            System.out.println("ücretiniz: 15 tl dir");

        else //5 ten küçük değilse
            System.out.println("ücretiniz: 20 tl dir");









    }
}
