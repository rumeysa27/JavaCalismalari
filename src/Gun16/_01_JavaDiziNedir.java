package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int ogrNot;//1tane not saklar
        //50 kişi var
        //bizim bir tanımlamada BİRDEN FAZLA değer tutabilen bir değişkene ihtiyacımız var;
        //ÇÖZÜM:

        int[] notlar  =new int[50]; // 50 tane int saklayabilen notlar isimli değişken

        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        //...
        notlar[49]=95; //index dediği için 0dan başlar 49u alır 50 almaz yani lenght-1dir indexi yani 0-49
        System.out.println("notlar[0]= " +notlar[0]); //burada 50den fazla olursa challanger patlar

        System.out.println("notlar.lenght= "+ notlar.length);//50 yani toplam eleman sayısını verir.
        //0dan başlıyor başı sonu döngüsü belli olduğu için FOR oluyor
        Scanner oku=new Scanner(System.in);
        for (int i=0; i<notlar.length;i++)
        {
            System.out.print("notu giriniz=");
            notlar[i]=oku.nextInt();
        }
        for (int i=0;i<notlar.length;i++)
        {
            System.out.println(notlar[i]); //i->0,1,2,3,4,5,....,49
        }



    }
}
