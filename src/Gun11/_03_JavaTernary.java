package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi=oku.nextInt();

        if (sayi % 2 == 0)  // sayının ikiye bölümünden kalan 0'a eşit demektir bu da çift sayının formülü
                            // sayının ikiye bölümünden kalan 1'e eşit demekse bu da tek sayının formülü
            System.out.println("çift");
        else
            System.out.println("tek");

        String sonuc= (sayi % 2 == 0 ) ? "çift" : "tek"; // ? -> if : -> else (soru işareti(?) if yani,
        // : bu da else  anlamına geliyor

        System.out.println("sonuc = " + sonuc);

        System.out.println((sayi %2 == 0)? "çift" : "tek");
    }
}
