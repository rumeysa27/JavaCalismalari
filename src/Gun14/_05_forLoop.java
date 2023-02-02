package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya(dahil)kadar olan sayıların çarpımınıı bulunuz.
        //2.bölüm:carpimin degeri 10000i geçtiğinde işlem sonlansın.
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi=oku.nextInt();

        int carpim=1;
        for (int i=1; i<=sayi;i++)
        {
            carpim=carpim*i;

            if (carpim > 10000) {
                System.out.println("break çalıştı");
                break;
            }
        }

        System.out.println("carpım= " + carpim);





    }
}
