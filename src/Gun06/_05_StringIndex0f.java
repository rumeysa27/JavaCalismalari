package Gun06;

import java.util.Scanner;

public class _05_StringIndex0f {
    public static void main(String[] args) {
        // 01234   : harflerin oda numaraları 0 dan başlar: index.
        // Bugün

        String cumle= "Merhaba Dünya";
        // D nin index i kaçtır
        // M nin index i kaçtır
        // 0(506)3445567 -> ( in oda numarası kaçtır
        // Verilen karakter(ler)in string içinde İNDEX ini verir

        System.out.println("cumle.indexOf(M) =" + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.index0f(a)= " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf() =" + cumle.indexOf("")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok

        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf( "a",5)); //6
        // a yı aramaya 5(dahil) nolu index ten sonra başla





    }
}
