package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girilen bir  sayının pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz=");
        int sayi= oku.nextInt();

        if (sayi > 0)
            System.out.println("pozitif");

        else // sayı eğer pozitifse else si yani (tersi) ya sıfırdır ya da negatiftir


          if (sayi < 0 )
            System.out.println("negatif");
          else
              System.out.println("sıfır");








    }
}
