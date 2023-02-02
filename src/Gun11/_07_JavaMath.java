package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
      //Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku=new Scanner(System.in);


        System.out.println("sayi1 değeri=");
        int sayi1=oku.nextInt();

        System.out.println("sayi2 değeri=");
        int sayi2=oku.nextInt();

        System.out.println("sayi3 değeri=");
        int sayi3=oku.nextInt();

        int enb=Math.max(sayi1,sayi2);
        enb=Math.max(enb,sayi3);
        System.out.println("enb =" +enb);

        //2.yöntem
        int enb2= Math.max(sayi1, Math.max(sayi2,sayi3));
        System.out.println("enb2 = " + enb2);




    }
}
