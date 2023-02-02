package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //kullanıcın gireceği 2 sayının toplamını bir fomksiyonda buldurup bunun sonucunu da main de yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.println("1.Sayı =");
        int s1=oku.nextInt();
        System.out.println("2.sayı=");
        int s2=oku.nextInt();

        int toplam=toplamBul(s1,s2);
        System.out.println("toplam="+ toplam);
    }
    public static int toplamBul(int sayi1, int sayi2)
    {
      return (sayi1+sayi2) ;
    }
}
