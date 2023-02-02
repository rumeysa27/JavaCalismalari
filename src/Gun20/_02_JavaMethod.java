package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği 2sayıdan büyük olanını bulma işlemini bir metodda yazdıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı=");
        int sayi1=oku.nextInt();

        System.out.print("2.Sayı=");
        int sayi2=oku.nextInt();

       int enb= enBul(sayi1,sayi2);
        System.out.println("enb="+ enb);

    }
    public static int enBul(int s1, int s2){
        //1.yöntem
        int donecek;
        if (s1>s2)
            donecek=s1;
        else
            donecek=s2;
        return donecek;

        //2.yöntem //en çok kullanılan yöntem bu
        //return s1>s2 ? s1: s2;

       /* //3.yöntem //ve bu en çok kullanılan
       if (s1>s2)
            return s1;
        else
            return s2; */








    }

}
