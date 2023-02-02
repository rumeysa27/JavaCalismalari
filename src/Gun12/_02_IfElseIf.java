package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
     //girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
     //toplama için T, çıkarma için Ç, çarpma için P,bölme için B harflerini
        // yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp sonucu yazdırınız.
        //2sayı aldıktan sonra,
        //toplama ->T
        //çıkarma ->Ç
        //çarpma -> P
        //bölme -> B

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi=");
        int s1=oku.nextInt();

        System.out.print("2.sayi=");
        int s2=oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("çıkarma için Ç");
        System.out.println("çarpma için P");
        System.out.println("bölme için B");
        System.out.println("seçiminiz");
        Scanner okuStr=new Scanner(System.in);
        String secim=okuStr.next();

        //merdivenli if, ladder if
        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam= " +(s1+s2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("farkı= " +(s1-s2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("çarpımı = " +(s1*s2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("bölümü = " +(s1/s2));
                    else
                        System.out.println("yanlış seçim");
























    }
}
